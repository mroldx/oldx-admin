package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.modules.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 18:06
 */
@Service("sysMenuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private OSysMenuMapper oSysMenuMapper;

    @Override
    public String findUserPermissions(String userName) {
        List<OSysMenu> permissions = this.oSysMenuMapper.findUserPermissions(userName);
        return permissions.stream().map(OSysMenu::getPerms).collect(Collectors.joining(","));
    }

    @Override
    public List<OSysMenu> selectMenuList(Long userId) {

        //String roleName = sysRoleMapper.selectRoleNameByUserId(userId.toString());
        List<OSysMenu> oSysMenus = oSysMenuMapper.selectMenuList(userId);
        return getChildPerms(oSysMenus, 0);
    }

    /**
     * 根据父节点的ID获取所有子节点
     *
     * @param list     分类表
     * @param parentId 传入的父节点ID
     * @return String
     */
    public List<OSysMenu> getChildPerms(List<OSysMenu> list, int parentId) {
        List<OSysMenu> returnList = new ArrayList<OSysMenu>();
        for (Iterator<OSysMenu> iterator = list.iterator(); iterator.hasNext(); ) {
            OSysMenu t = (OSysMenu) iterator.next();
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (t.getParentId() == parentId) {
                recursionFn(list, t);
                returnList.add(t);
            }
        }
        return returnList;
    }

    /**
     * 递归列表
     *
     * @param list
     * @param t
     */
    private void recursionFn(List<OSysMenu> list, OSysMenu t) {
        // 得到子节点列表
        List<OSysMenu> childList = getChildList(list, t);
        t.setChildren(childList);
        for (OSysMenu tChild : childList) {
            if (hasChild(list, tChild)) {
                // 判断是否有子节点
                Iterator<OSysMenu> it = childList.iterator();
                while (it.hasNext()) {
                    OSysMenu n = (OSysMenu) it.next();
                    recursionFn(list, n);
                }
            }
        }
    }

    /**
     * 得到子节点列表
     */
    private List<OSysMenu> getChildList(List<OSysMenu> list, OSysMenu t) {
        List<OSysMenu> tlist = new ArrayList<OSysMenu>();
        Iterator<OSysMenu> it = list.iterator();
        while (it.hasNext()) {
            OSysMenu n = (OSysMenu) it.next();
            if (n.getParentId().longValue() == t.getMenuId().longValue()) {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<OSysMenu> list, OSysMenu t) {
        return getChildList(list, t).size() > 0 ? true : false;
    }

    @Override
    public List<OSysMenu> selectMenuListByUserId(OSysMenu menu) {
        return null;
    }

    @Override
    public List<String> selectMenuPermsByUserId(Long userId) {
        return null;
    }

    @Override
    public List<OSysMenu> selectMenuTreeAll() {
        return null;
    }

    @Override
    public List<OSysMenu> selectMenuTreeByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Integer> selectMenuListByRoleId(Long roleId) {
        return null;
    }

    @Override
    public OSysMenu selectMenuById(Long menuId) {
        return null;
    }

    @Override
    public int hasChildByMenuId(Long menuId) {
        return 0;
    }

    @Override
    public int insertMenu(OSysMenu menu) {
        menu.setCreateTime(new Date());

        return oSysMenuMapper.insert(menu);
    }

    @Override
    public int updateMenu(OSysMenu menu) {
        menu.setModifyTime(new Date());
        this.setMenu(menu);
        return oSysMenuMapper.updateByPrimaryKeySelective(menu);
    }

    private void setMenu(OSysMenu menu) {
        if (menu.getParentId() == null)
            menu.setParentId(0L);
        if ("1".equals(menu.getType())) {
            menu.setUrl(null);
        }
    }

    @Override
    public int deleteMenuById(Long menuId) {
        return oSysMenuMapper.deleteByPrimaryKey(menuId);
    }

    @Override
    public OSysMenu checkMenuNameUnique(String menuName, Long parentId) {
        return null;
    }

    @Override
    public List<OSysMenu> selectTreeTest(Long id) {
        List<OSysMenu> oSysMenusList = oSysMenuMapper.selectMenuList(id);
        oSysMenusList.stream().filter(oSysMenu -> oSysMenu.getParentId() == 0
        ).map((menu) -> {
            menu.setCharten(getCha(menu,oSysMenusList));
            return menu;
        }).collect(Collectors.toList());
        return oSysMenusList;
    }

    private List<OSysMenu> getCha(OSysMenu root, List<OSysMenu> all) {
        List<OSysMenu> oSysMenus = all.stream().filter(oSysMenu -> {
            return oSysMenu.getParentId() == root.getMenuId();
        }).map(oSysMenu -> {
            oSysMenu.setCharten(getCha(oSysMenu, all));
            return oSysMenu;
        }).collect(Collectors.toList());
        return oSysMenus;
    }
}
