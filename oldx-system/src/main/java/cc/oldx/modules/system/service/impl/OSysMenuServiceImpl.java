package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysMenuEntity;
import cc.oldx.mbg.mapper.OSysMenuDao;
import cc.oldx.modules.system.service.OSysMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("oSysMenuService")
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
        return oSysMenusList;
    }

    private List<OSysMenuEntity> getCha(OSysMenuEntity root, List<OSysMenuEntity> all) {
        List<OSysMenuEntity> oSysMenus = all.stream().filter(oSysMenu -> {
            return oSysMenu.getParentId() == root.getMenuId();
        }).map(oSysMenu -> {
            oSysMenu.setCharten(getCha(oSysMenu, all));
            return oSysMenu;
        }).collect(Collectors.toList());
        return oSysMenus;
    }
}