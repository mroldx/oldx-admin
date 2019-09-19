package com.oldx.web.service;

import com.oldx.common.utils.DateUtil;
import com.oldx.mbg.domain.MoliUser;
import com.oldx.web.bo.MoLiUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Date;

/**
 * 处理用户信息获取逻辑
 */
@Configuration
public class MoLiUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private MMenuService mMenuService;
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("根据用户名查找用户信息，登录用户名:"+username);
        MoliUser user = userService.getUserByUserName(username);
        if (user != null) {
            String permissionList = mMenuService.getPermissionList(user.getUsername());
            MoLiUserDetails userDetails=new MoLiUserDetails(user.getUsername(),user.getPassword(),
                    true,true,true,true,AuthorityUtils.commaSeparatedStringToAuthorityList(permissionList));
           /* userDetails.setTheme("");
            userDetails.setAvatar("");*/
            userDetails.setEmail(user.getEmail());
            userDetails.setMobile(user.getMobile());
            userDetails.setSex(user.getSex());
            userDetails.setUserId(user.getUserId());
            userDetails.setPassword(user.getPassword());
            userDetails.setLoginTime(DateUtil.getDateFormat(new Date(), DateUtil.FULL_DATE_FORMAT));
            return userDetails;
        }else {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
    }
}
