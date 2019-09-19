package com.oldx.web.bo;

import com.oldx.common.domain.LoginType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
@Getter
@Setter
public class MoLiUserDetails extends User {

    private static final long serialVersionUID = 2017845963758421135L;

    private String remoteAddress;

    private LoginType loginType = LoginType.normal;

    private String theme;

    private String avatar;

    private Long userId;

    private String email;

    private String mobile;

    private String sex;

    private String password;

    private String loginTime;

    public MoLiUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public MoLiUserDetails(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
