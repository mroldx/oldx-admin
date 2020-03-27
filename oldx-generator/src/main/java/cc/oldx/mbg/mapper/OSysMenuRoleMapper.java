package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysMenuRole;
import cc.oldx.mbg.domain.OSysMenuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSysMenuRoleMapper {
    long countByExample(OSysMenuRoleExample example);

    int deleteByExample(OSysMenuRoleExample example);

    int insert(OSysMenuRole record);

    int insertSelective(OSysMenuRole record);

    List<OSysMenuRole> selectByExample(OSysMenuRoleExample example);

    int updateByExampleSelective(@Param("record") OSysMenuRole record, @Param("example") OSysMenuRoleExample example);

    int updateByExample(@Param("record") OSysMenuRole record, @Param("example") OSysMenuRoleExample example);
}