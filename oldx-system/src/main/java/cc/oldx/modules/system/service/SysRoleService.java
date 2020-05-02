package cc.oldx.modules.system.service;

import cc.oldx.mbg.domain.OSysUser;

import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/5/2 14:42
 */
public interface SysRoleService {
    /**
     * 添加用户和用户角色关系
     * @param user
     * @param roles
     */
    public void addUserWithRole(OSysUser user, String roles);


    /**
     * 修改用户和用户角色关系
     * @param user
     * @param roles
     */
    public void editUserWithRole(OSysUser user,String roles);

    /**
     * 获取用户的授权角色
     * @param username
     * @return
     */
    public List<String> getRole(String username);
}
