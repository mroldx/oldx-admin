package com.oldx.mbg.mapper;

import com.oldx.mbg.domain.MDept;
import com.oldx.mbg.domain.MDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MDeptMapper {
    long countByExample(MDeptExample example);

    int deleteByExample(MDeptExample example);

    int deleteByPrimaryKey(Long deptId);

    int insert(MDept record);

    int insertSelective(MDept record);

    List<MDept> selectByExample(MDeptExample example);

    MDept selectByPrimaryKey(Long deptId);

    int updateByExampleSelective(@Param("record") MDept record, @Param("example") MDeptExample example);

    int updateByExample(@Param("record") MDept record, @Param("example") MDeptExample example);

    int updateByPrimaryKeySelective(MDept record);

    int updateByPrimaryKey(MDept record);
}