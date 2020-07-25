package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysRoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 角色表
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysRoleService extends IService<OSysRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取用户的授权角色
     * @param username
     * @return
     */
    public List<OSysRoleEntity> getRoleByUserName(String username);

    /**
     * 获取所有角色
     *
     * @return 角色列表
     */
    List<OSysRoleEntity> findAllRoles();

    /**
     * 通过名称获取角色
     *
     * @param roleName 角色名称
     * @return 角色
     */
    OSysRoleEntity findByName(String roleName);

    /**
     * 创建角色
     *
     * @param role role
     */
    void createRole(OSysRoleEntity role);

    /**
     * 删除角色
     *
     * @param roleIds 角色id数组
     */
    void deleteRoles(String[] roleIds);

    /**
     * 更新角色
     *
     * @param role role
     */
    void updateRole(OSysRoleEntity role);
}

