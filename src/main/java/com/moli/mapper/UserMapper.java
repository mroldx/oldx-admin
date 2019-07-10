package com.moli.mapper;

import com.moli.pojo.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    User Sel(int id);
}
