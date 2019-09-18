package com.oldx.web.service.impl;
import com.oldx.mbg.mapper.MoliUserMapper;
import com.oldx.mbg.pojo.MoliUser;
import com.oldx.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    public MoliUserMapper userMapper;


    @Override
    public void insertUser() {
        MoliUser user=new MoliUser();
        user.setUserId(0L);
        user.setUsername("moli");
        user.setPassword("moli");
        user.setDeptId(0L);
        user.setEmail("");
        user.setMobile("");
        user.setStatus("");
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        user.setLastLoginTime(new Date());
        user.setSex("");
        user.setIcon("");
        user.setDesciption("");
        userMapper.insert(user);
    }
}
