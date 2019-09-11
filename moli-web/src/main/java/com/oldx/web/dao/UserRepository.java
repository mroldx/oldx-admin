package com.oldx.web.dao;


import com.oldx.mbg.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @www.codesheep.cn
 * 20190312
 */
@Mapper
public interface UserRepository{
    @Select("select * from user where username=#{username}")
    User findByUsername(String username);
}
