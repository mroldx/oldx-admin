package cc.oldx.modules.system.service;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.modules.system.dto.OSysUserParam;
import cc.oldx.modules.system.dto.UserAdminParam;

import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 14:48
 * 后台管理service
 */
public interface SysAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    OSysUser getAdminByUsername(String username);

    /**
     * 注册功能
     */
    OSysUser register(OSysUserParam OSysUserParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 刷新token的功能
     *
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     */
    OSysUser getItem(Long id);

    /**
     * 根据用户名或昵称分页查询用户
     */
    List<OSysUser> list(String name, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     */
    int update(Long id, UserAdminParam admin);

    /**
     * 删除指定用户
     */
    int delete(Long id);

    /**
     * 修改用户登录时间
     */
     int updateLoginTime(long id);

    /**
     * 修改用户状态
     *
     * @param oysuser 用户信息
     * @return 结果
     */
    public int updateUserStatus(OSysUser user);

    /**
     * 修改用户头像
     *
     * @param userName 用户名
     * @param avatar 头像地址
     * @return 结果
     */
    public boolean updateUserAvatar(String userName, String avatar);

    /**
     * 批量删除用户信息
     *
     * @param userIds 需要删除的用户ID
     * @return 结果
     */
    public int deleteUserByIds(Long[] userIds);

    /**
     * 导入用户数据
     *
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importUser(List<OSysUser> userList, Boolean isUpdateSupport, String operName);

    /**
     * 重置密码
     *
     * @param username
     * @param oldpassword
     * @param newpassword
     * @param confirmpassword
     * @return
     */
    public boolean resetPassword(String username, String oldpassword, String newpassword, String confirmpassword);

    /**
     * 修改密码
     *
     * @param sysUser
     * @return
     */
    public boolean changePassword(OSysUser oSysUser);
}
