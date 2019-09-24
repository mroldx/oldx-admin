package com.oldx.web.service.impl;

import com.oldx.mbg.domain.MoliUser;
import com.oldx.mbg.domain.MoliUserExample;
import com.oldx.mbg.mapper.MoliUserMapper;
import com.oldx.web.dao.MoLiUserDao;
import com.oldx.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    public MoliUserMapper userMapper;
    @Autowired
    private MoLiUserDao moLiUserDao;

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    public MoliUser insertUser(MoliUser user) {
        user.setUserId(0L);
        user.setDeptId(0L);
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        user.setLastLoginTime(new Date());
        user.setSex("0");
        MoliUserExample userExample=new MoliUserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<MoliUser> users=userMapper.selectByExample(userExample);
        if(users.size()>0){
            log.info("已有该用户名添加失败");
            return null;
        }
        BCryptPasswordEncoder bCrypt= new BCryptPasswordEncoder();
        String encodePassword=bCrypt.encode(user.getPassword());
        user.setPassword(encodePassword);
        userMapper.insert(user);
        return user;
    }

    @Override
    public MoliUser getUserByUserName(String username) {
        MoliUserExample userExample=new MoliUserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<MoliUser> userList=userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public MoliUser getUserList() {
        MoliUser moliUser = userMapper.selectByPrimaryKey(2l);
        return moliUser;
    }

    @Override
    public void updateMUser(MoliUser user, Long[] rolesSelect) {

    }

    @Override
    public List<MoliUser> findAllMUserWithDept(MoliUser user) {
        List<MoliUser> users = moLiUserDao.findUserWithDept(user);
        if (users!=null){
            System.out.println(users);
        }
        return users;
    }
}
