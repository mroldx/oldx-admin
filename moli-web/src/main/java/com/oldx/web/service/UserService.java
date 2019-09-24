package com.oldx.web.service;

import com.oldx.mbg.domain.MoliUser;

import java.util.List;

public interface UserService {
    MoliUser insertUser(MoliUser user);

    MoliUser getUserByUserName(String username);

    MoliUser getUserList();

    void updateMUser(MoliUser user, Long[] rolesSelect);

    List<MoliUser> findAllMUserWithDept(MoliUser user);
}
