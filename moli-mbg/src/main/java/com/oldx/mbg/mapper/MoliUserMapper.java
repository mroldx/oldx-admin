package com.oldx.mbg.mapper;

import com.oldx.mbg.pojo.MoliUser;
import com.oldx.mbg.pojo.MoliUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoliUserMapper {
    long countByExample(MoliUserExample example);

    int deleteByExample(MoliUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(MoliUser record);

    int insertSelective(MoliUser record);

    List<MoliUser> selectByExample(MoliUserExample example);

    MoliUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") MoliUser record, @Param("example") MoliUserExample example);

    int updateByExample(@Param("record") MoliUser record, @Param("example") MoliUserExample example);

    int updateByPrimaryKeySelective(MoliUser record);

    int updateByPrimaryKey(MoliUser record);
}