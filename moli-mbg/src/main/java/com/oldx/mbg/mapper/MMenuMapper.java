package com.oldx.mbg.mapper;

import com.oldx.mbg.domain.MMenu;
import com.oldx.mbg.domain.MMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MMenuMapper {
    long countByExample(MMenuExample example);

    int deleteByExample(MMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(MMenu record);

    int insertSelective(MMenu record);

    List<MMenu> selectByExampleWithBLOBs(MMenuExample example);

    List<MMenu> selectByExample(MMenuExample example);

    MMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByExample(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByPrimaryKeySelective(MMenu record);

    int updateByPrimaryKeyWithBLOBs(MMenu record);

    int updateByPrimaryKey(MMenu record);
}