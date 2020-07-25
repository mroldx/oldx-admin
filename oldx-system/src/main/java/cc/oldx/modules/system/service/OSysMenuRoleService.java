package cc.oldx.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysMenuRoleEntity;

import java.util.Map;

/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysMenuRoleService extends IService<OSysMenuRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);


    /**
     * 删除角色菜单关联数据
     *
     * @param roleIds 角色id
     */
    void deleteRoleMenusByRoleId(String[] roleIds);

    /**
     * 删除角色菜单关联数据
     *
     * @param menuIds 菜单id
     */
    void deleteRoleMenusByMenuId(String[] menuIds);
}

