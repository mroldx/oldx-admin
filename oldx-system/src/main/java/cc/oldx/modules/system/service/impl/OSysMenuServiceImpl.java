package cc.oldx.modules.system.service.impl;

import cc.oldx.common.router.VueRouter;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysMenuEntity;
import cc.oldx.mbg.mapper.OSysMenuDao;
import cc.oldx.modules.system.service.OSysMenuService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Old丶x
 */

@Service("oSysMenuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OSysMenuServiceImpl extends ServiceImpl<OSysMenuDao, OSysMenuEntity> implements OSysMenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysMenuEntity> page = this.page(
                new Query<OSysMenuEntity>().getPage(params),
                new QueryWrapper<OSysMenuEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public String findUserPermissions(String userName) {
        List<OSysMenuEntity> permissions = this.baseMapper.findUserPermissions(userName);
        return permissions.stream().map(OSysMenuEntity::getPerms).collect(Collectors.joining(","));
    }

    @Override
    public List<OSysMenuEntity> selectMenuList(Long userId) {
        List<OSysMenuEntity> oSysMenusList = this.baseMapper.selectMenuList(userId);
        oSysMenusList.stream().filter(oSysMenu -> oSysMenu.getParentId() == 0
        ).map((menu) -> {
            menu.setCharten(getCha(menu, oSysMenusList));
            return menu;
        }).collect(Collectors.toList());
        System.out.println(oSysMenusList);
        return oSysMenusList;
    }

    @Override
    public List<VueRouter<OSysMenuEntity>> getUserRouters(String username) {
        //todo
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createMenu(OSysMenuEntity menu) {
        menu.setCreateTime(new Date());
        if (menu.getParentId() == null) {
            menu.setParentId(0L);
        }
        if ("1".equals(menu.getType())) {
            menu.setUrl(null);
            menu.setOrderbyNum(null);
        }
        this.save(menu);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateMenu(OSysMenuEntity menu) {
        if (menu.getParentId() == null) {
            menu.setParentId(0L);
        }
        if ("1".equals(menu.getType())) {
            menu.setUrl(null);
            menu.setOrderbyNum(null);
        }
        menu.setModifyTime(new Date());
        this.updateById(menu);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMeuns(String[] menuIds) {
        this.delete(Arrays.asList(menuIds));
    }

    private void delete(List<String> menuIds) {
        removeByIds(menuIds);
        LambdaQueryWrapper<OSysMenuEntity> oSysMenuEntitymapper = new LambdaQueryWrapper<>();
        oSysMenuEntitymapper.in(OSysMenuEntity::getParentId, menuIds);
        List<OSysMenuEntity> menuEntities = baseMapper.selectList(oSysMenuEntitymapper);
        if (CollectionUtils.isNotEmpty(menuEntities)) {
            List<String> list = new ArrayList<>();
            menuEntities.forEach(
                    m -> list.add(String.valueOf(m.getMenuId()))
            );
            this.delete(list);
        }
    }


    private List<OSysMenuEntity> getCha(OSysMenuEntity root, List<OSysMenuEntity> all) {
        List<OSysMenuEntity> oSysMenus = all.stream().filter(oSysMenu -> {
            return oSysMenu.getParentId().equals(root.getMenuId());
        }).map(oSysMenu -> {
            oSysMenu.setCharten(getCha(oSysMenu, all));
            return oSysMenu;
        }).collect(Collectors.toList());
        return oSysMenus;
    }
}