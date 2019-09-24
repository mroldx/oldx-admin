package com.oldx.web.service.impl;

import com.oldx.mbg.domain.MMenu;
import com.oldx.mbg.mapper.MMenuMapper;
import com.oldx.web.service.MMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service("mMenuService")
public class MMenuServiceImpl implements MMenuService {
    @Autowired
    public MMenuMapper mMenuMapper;

    @Override
    public String getPermissionList(String username) {
        List<MMenu> mMenuList = this.mMenuMapper.findUserPermissions(username);
        System.out.println( mMenuList.stream().map(MMenu::getPerms).collect(Collectors.joining(",")));
        return mMenuList.stream().map(MMenu::getPerms).collect(Collectors.joining(","));
    }
}
