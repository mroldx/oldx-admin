package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.mbg.mapper.OSysMenuMapper;
import cc.oldx.modules.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 18:06
 */
@Service("OsMenuService")
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
    public List<OSysMenu> selectMenuList(OSysMenu menu) {
        return null;
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
        return 0;
    }

    @Override
    public int updateMenu(OSysMenu menu) {
        return 0;
    }

    @Override
    public int deleteMenuById(Long menuId) {
        return 0;
    }

    @Override
    public OSysMenu checkMenuNameUnique(String menuName, Long parentId) {
        return null;
    }
}
