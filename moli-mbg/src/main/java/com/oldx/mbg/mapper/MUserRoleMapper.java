package com.oldx.mbg.mapper;

import com.oldx.mbg.domain.MUserRole;
import com.oldx.mbg.domain.MUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserRoleMapper {
    long countByExample(MUserRoleExample example);

    int deleteByExample(MUserRoleExample example);

    int insert(MUserRole record);

    int insertSelective(MUserRole record);

    List<MUserRole> selectByExample(MUserRoleExample example);

    int updateByExampleSelective(@Param("record") MUserRole record, @Param("example") MUserRoleExample example);

    int updateByExample(@Param("record") MUserRole record, @Param("example") MUserRoleExample example);
}