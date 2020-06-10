package cc.oldx.mbg.mapper;


import cc.oldx.mbg.domain.OSysMenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Mapper
public interface OSysMenuDao extends BaseMapper<OSysMenuEntity> {
    /**
     * 查询某个人所有权限
     * @param userName
     * @return
     */
    List<OSysMenuEntity> findUserPermissions(@Param("userName") String userName);


    /**
     * 查询系统菜单列表
     *
     * @param 用户ID
     * @return 菜单列表
     */
     List<OSysMenuEntity> selectMenuList(Long userId);

    /**
     * 根据用户查询系统菜单列表
     *
     * @param menu 菜单信息
     * @return 菜单列表
     */
    public List<OSysMenuEntity> selectMenuListByUserId(OSysMenuEntity menu);
}
