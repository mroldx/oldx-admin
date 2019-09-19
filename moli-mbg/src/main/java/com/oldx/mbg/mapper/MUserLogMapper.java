package com.oldx.mbg.mapper;

import com.oldx.mbg.domain.MUserLog;
import com.oldx.mbg.domain.MUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserLogMapper {
    long countByExample(MUserLogExample example);

    int deleteByExample(MUserLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MUserLog record);

    int insertSelective(MUserLog record);

    List<MUserLog> selectByExampleWithBLOBs(MUserLogExample example);

    List<MUserLog> selectByExample(MUserLogExample example);

    MUserLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MUserLog record, @Param("example") MUserLogExample example);

    int updateByExampleWithBLOBs(@Param("record") MUserLog record, @Param("example") MUserLogExample example);

    int updateByExample(@Param("record") MUserLog record, @Param("example") MUserLogExample example);

    int updateByPrimaryKeySelective(MUserLog record);

    int updateByPrimaryKeyWithBLOBs(MUserLog record);

    int updateByPrimaryKey(MUserLog record);
}