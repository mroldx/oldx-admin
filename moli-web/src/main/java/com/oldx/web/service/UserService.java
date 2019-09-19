package com.oldx.web.service;

import com.oldx.mbg.domain.MoliUser;

public interface UserService {
    MoliUser insertUser(MoliUser user);
    MoliUser getUserByUserName(String username);
}
