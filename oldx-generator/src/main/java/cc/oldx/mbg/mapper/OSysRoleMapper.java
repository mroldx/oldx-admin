package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysRole;
import cc.oldx.mbg.domain.OSysRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OSysRoleMapper {
    long countByExample(OSysRoleExample example);

    int deleteByExample(OSysRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OSysRole record);

    int insertSelective(OSysRole record);

    List<OSysRole> selectByExample(OSysRoleExample example);

    OSysRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OSysRole record, @Param("example") OSysRoleExample example);

    int updateByExample(@Param("record") OSysRole record, @Param("example") OSysRoleExample example);

    int updateByPrimaryKeySelective(OSysRole record);

    int updateByPrimaryKey(OSysRole record);

    String selectRoleNameByUserId(String userId);
}