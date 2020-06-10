package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.modules.system.dto.OSysUserParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysUserService extends IService<OSysUserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 根据用户名获取后台管理员
     */
    OSysUserEntity getAdminByUsername(String  username);

    /**
     * 注册
     */
    public OSysUserEntity register(OSysUserParam OSysUserParam);


    /**
     * 登录
     */
    public String login(String username, String password);


    /**
     * 刷新token的功能
     *
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);


    /**
     * 修改用户登录时间
     */
    int updateLoginTime(long id);

    /**
     * 修改用户状态
     *
     * @param user 用户信息
     * @return 结果
     */
    public int updateUserStatus(OSysUserEntity user);

    /**
     * 修改用户头像
     *
     * @param userName 用户名
     * @param avatar 头像地址
     * @return 结果
     */
    public int updateUserAvatar(String userName, String avatar);

}

