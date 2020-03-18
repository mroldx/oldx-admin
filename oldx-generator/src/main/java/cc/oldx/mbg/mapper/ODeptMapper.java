package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.ODept;
import cc.oldx.mbg.domain.ODeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ODeptMapper {
    long countByExample(ODeptExample example);

    int deleteByExample(ODeptExample example);

    int deleteByPrimaryKey(Long deptId);

    int insert(ODept record);

    int insertSelective(ODept record);

    List<ODept> selectByExample(ODeptExample example);

    ODept selectByPrimaryKey(Long deptId);

    int updateByExampleSelective(@Param("record") ODept record, @Param("example") ODeptExample example);

    int updateByExample(@Param("record") ODept record, @Param("example") ODeptExample example);

    int updateByPrimaryKeySelective(ODept record);

    int updateByPrimaryKey(ODept record);
}