package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.mbg.domain.OSysMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OSysMenuMapper {
    long countByExample(OSysMenuExample example);

    int deleteByExample(OSysMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(OSysMenu record);

    int insertSelective(OSysMenu record);

    List<OSysMenu> selectByExampleWithBLOBs(OSysMenuExample example);

    List<OSysMenu> selectByExample(OSysMenuExample example);

    OSysMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") OSysMenu record, @Param("example") OSysMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") OSysMenu record, @Param("example") OSysMenuExample example);

    int updateByExample(@Param("record") OSysMenu record, @Param("example") OSysMenuExample example);

    int updateByPrimaryKeySelective(OSysMenu record);

    int updateByPrimaryKeyWithBLOBs(OSysMenu record);

    int updateByPrimaryKey(OSysMenu record);

    /**
     * 查询某个人所有权限菜单
     * @param userName
     * @return
     */
    List<OSysMenu> findUserPermissions(String userName);
}