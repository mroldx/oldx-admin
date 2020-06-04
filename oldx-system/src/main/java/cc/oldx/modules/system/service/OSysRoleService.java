package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysRoleEntity;
import cc.oldx.mbg.domain.OSysUserEntity;
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
     * 添加用户和用户角色关系
     * @param user
     * @param roles
     */
    public void addUserWithRole(OSysUserEntity user, String roles);


    /**
     * 修改用户和用户角色关系
     * @param user
     * @param roles
     */
    public void editUserWithRole(OSysUserEntity user,String roles);

    /**
     * 获取用户的授权角色
     * @param username
     * @return
     */
    public List<String> getRole(String username);
}

