package cc.oldx.modules.security.service;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.modules.security.bo.OSysUserDetails;
import cc.oldx.modules.system.service.SysAdminService;
import cc.oldx.modules.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 15:39
 */
@Configuration
public class OSysUserDetailsService implements UserDetailsService {

    @Autowired
    private SysAdminService oadminService;

    @Autowired
    private SysMenuService SysMenuService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        OSysUser user = this.oadminService.getAdminByUsername(username);
        if (user != null) {
            String userPermissions = this.SysMenuService.findUserPermissions(username);
          //  boolean notLocked = false;
/*            //判断帐号有效性
            if(StringUtils.equals(OSysUser.STATUS_VALID, user.getStatus()))
                notLocked = true;*/
            OSysUserDetails userDetails = new OSysUserDetails(user.getUsername(), user.getPassword(), true, true, true, true,
                    AuthorityUtils.commaSeparatedStringToAuthorityList(userPermissions));
            userDetails.setPassword(user.getPassword());
            return userDetails;
        } else {
            throw new UsernameNotFoundException("用户名不存在");
        }
    }
}
