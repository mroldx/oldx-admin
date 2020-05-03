package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.ODept;
import cc.oldx.mbg.domain.ODeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<ODept> selectDeptList(ODept dept);
}