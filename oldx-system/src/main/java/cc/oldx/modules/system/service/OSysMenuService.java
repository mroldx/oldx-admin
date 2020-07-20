package cc.oldx.modules.system.service;

import cc.oldx.common.router.VueRouter;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysMenuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysMenuService extends IService<OSysMenuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取用户权限perms list
     *
     * @param userName
     * @return 权限值  perms  q,b,c,d
     */
    public String findUserPermissions(String userName);

    /**
     * 获取菜单列表
     *
     * @param userId
     * @return 菜单列表
     */
    public List<OSysMenuEntity> selectMenuList(Long userId);

    /**
     * 获取用户路由
     *
     * @param username 用户名
     * @return 用户路由
     */
    List<VueRouter<OSysMenuEntity>> getUserRouters(String username);

    /**
     * 创建菜单
     *
     * @param menu menu
     */
    void createMenu(OSysMenuEntity menu);

    /**
     * 更新菜单
     *
     * @param menu menu
     */
    void updateMenu(OSysMenuEntity menu);

    /**
     * 递归删除菜单/按钮
     *
     * @param menuIds menuIds
     */
    void deleteMeuns(String[] menuIds);


}

