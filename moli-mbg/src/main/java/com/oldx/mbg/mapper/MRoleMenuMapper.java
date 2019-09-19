package com.oldx.mbg.mapper;

import com.oldx.mbg.domain.MRoleMenu;
import com.oldx.mbg.domain.MRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MRoleMenuMapper {
    long countByExample(MRoleMenuExample example);

    int deleteByExample(MRoleMenuExample example);

    int insert(MRoleMenu record);

    int insertSelective(MRoleMenu record);

    List<MRoleMenu> selectByExample(MRoleMenuExample example);

    int updateByExampleSelective(@Param("record") MRoleMenu record, @Param("example") MRoleMenuExample example);

    int updateByExample(@Param("record") MRoleMenu record, @Param("example") MRoleMenuExample example);
}