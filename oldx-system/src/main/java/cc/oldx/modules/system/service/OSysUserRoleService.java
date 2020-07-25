package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.mbg.domain.OSysUserRoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysUserRoleService extends IService<OSysUserRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);


    /**
     * 添加用户和用户角色关系
     * @param user
     * @param roles
     */
    public void addUserWithRole(OSysUserEntity user, String role_id);


    /**
     * 修改用户和用户角色关系
     * @param user
     * @param roles
     */
    public void editUserWithRole(OSysUserEntity user,String roles);


    /**
     * 删除角色用户管理关系
     *
     * @param roleIds 角色id数组
     */
    void deleteUserRolesByRoleId(String[] roleIds);

    /**
     * 删除角色用户管理关系
     *
     * @param userIds 用户id数组
     */
    void deleteUserRolesByUserId(String[] userIds);
}

