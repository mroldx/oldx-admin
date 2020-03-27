package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.mbg.domain.OSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSysUserMapper {
    long countByExample(OSysUserExample example);

    int deleteByExample(OSysUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(OSysUser record);

    int insertSelective(OSysUser record);

    List<OSysUser> selectByExample(OSysUserExample example);

    OSysUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") OSysUser record, @Param("example") OSysUserExample example);

    int updateByExample(@Param("record") OSysUser record, @Param("example") OSysUserExample example);

    int updateByPrimaryKeySelective(OSysUser record);

    int updateByPrimaryKey(OSysUser record);
}