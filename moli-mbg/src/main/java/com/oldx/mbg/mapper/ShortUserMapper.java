package com.oldx.mbg.mapper;

import com.oldx.mbg.pojo.ShortUser;
import com.oldx.mbg.pojo.ShortUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShortUserMapper {
    long countByExample(ShortUserExample example);

    int deleteByExample(ShortUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShortUser record);

    int insertSelective(ShortUser record);

    List<ShortUser> selectByExample(ShortUserExample example);

    ShortUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShortUser record, @Param("example") ShortUserExample example);

    int updateByExample(@Param("record") ShortUser record, @Param("example") ShortUserExample example);

    int updateByPrimaryKeySelective(ShortUser record);

    int updateByPrimaryKey(ShortUser record);
}