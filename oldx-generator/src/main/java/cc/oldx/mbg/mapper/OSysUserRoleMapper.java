package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysUserRole;
import cc.oldx.mbg.domain.OSysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSysUserRoleMapper {
    long countByExample(OSysUserRoleExample example);

    int deleteByExample(OSysUserRoleExample example);

    int insert(OSysUserRole record);

    int insertSelective(OSysUserRole record);

    List<OSysUserRole> selectByExample(OSysUserRoleExample example);

    int updateByExampleSelective(@Param("record") OSysUserRole record, @Param("example") OSysUserRoleExample example);

    int updateByExample(@Param("record") OSysUserRole record, @Param("example") OSysUserRoleExample example);
}