package cc.oldx.mbg.mapper;


import cc.oldx.mbg.domain.OSysRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色表
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Mapper
public interface OSysRoleDao extends BaseMapper<OSysRoleEntity> {
    /**
     * 通过用户名查找用户角色
     *
     * @param username 用户名
     * @return 用户角色集合
     */
    List<OSysRoleEntity> findUserRoleByUserName(String username);
}
