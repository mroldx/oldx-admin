package cc.oldx.modules.system.service;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.modules.system.dto.OSysUserParam;

import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 14:48
 * 后台管理service
 */
public interface OAdminService {
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
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 刷新token的功能
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
    int update(Long id, OSysUser admin);

    /**
     * 删除指定用户
     */
    int delete(Long id);

}
