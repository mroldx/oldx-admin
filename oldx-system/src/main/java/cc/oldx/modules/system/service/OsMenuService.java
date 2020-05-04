package cc.oldx.modules.system.service;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 18:05
 */
public interface OsMenuService {
    /**
     * 获取用户全部权限
     * @param userName
     * @return
     */
    String findUserPermissions(String userName);
}
