package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.mbg.mapper.OSysMenuMapper;
import cc.oldx.modules.system.service.OsMenuService;
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
public class OsMenuServiceImpl implements OsMenuService {
    @Autowired
    private OSysMenuMapper oSysMenuMapper;


    @Override
    public String findUserPermissions(String userName) {
        List<OSysMenu> permissions = this.oSysMenuMapper.findUserPermissions(userName);
        return permissions.stream().map(OSysMenu::getPerms).collect(Collectors.joining(","));
    }
}
