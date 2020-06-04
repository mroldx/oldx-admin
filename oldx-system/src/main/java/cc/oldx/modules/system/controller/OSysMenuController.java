package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysMenuEntity;
import cc.oldx.modules.system.service.OSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;



/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@RequestMapping("system/osysmenu")
public class OSysMenuController {
    @Autowired
    private OSysMenuService oSysMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osysmenu:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysMenuService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }

    @RequestMapping("/listTree")
    @PreAuthorize("hasAuthority('menu:list')")
    public CommonResult getMenu(Long userId){
        List<OSysMenuEntity> sysMenuList = oSysMenuService.selectMenuList(userId);
        return CommonResult.ok("获取菜单列表成功").put("菜单列表",sysMenuList);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{menuId}")
    //@RequiresPermissions("system:osysmenu:info")
    public CommonResult info(@PathVariable("menuId") Long menuId){
		OSysMenuEntity oSysMenu = oSysMenuService.getById(menuId);

        return CommonResult.ok().put("oSysMenu", oSysMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("system:osysmenu:save")
    public CommonResult save(@RequestBody OSysMenuEntity oSysMenu){
		oSysMenuService.save(oSysMenu);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:osysmenu:update")
    public CommonResult update(@RequestBody OSysMenuEntity oSysMenu){
		oSysMenuService.updateById(oSysMenu);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysmenu:delete")
    public CommonResult delete(@RequestBody Long[] menuIds){
		oSysMenuService.removeByIds(Arrays.asList(menuIds));

        return CommonResult.ok();
    }

}
