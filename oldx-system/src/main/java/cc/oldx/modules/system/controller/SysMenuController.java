package cc.oldx.modules.system.controller;

import cc.oldx.common.api.CommonResult;
import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.modules.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/5/2 14:09
 */
@RestController
@RequestMapping("/sys/menu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;
    @RequestMapping("/getMenuList")
    @PreAuthorize("hasAuthority('menu:list')")
    public CommonResult getMenuList(Long userId){
        List<OSysMenu> sysMenuList = sysMenuService.selectMenuList(userId);
        return CommonResult.success(sysMenuList,"获取菜单列表成功");
    }
}
