package cc.oldx.modules.system.controller;

import cc.oldx.common.annotation.MoliAspectLog;
import cc.oldx.common.constant.OldxConstant;
import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysMenuEntity;
import cc.oldx.modules.system.service.OSysMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;


/**
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@Api("系统菜单")
@RequiredArgsConstructor
@RequestMapping("system/osysmenu")
public class OSysMenuController {

    private final OSysMenuService oSysMenuService;


    /**
     * 列表
     */
    @MoliAspectLog(operModul = OldxConstant.MENU_MODUL, operType = "条件查询菜单", operDesc = "查询菜单列表")
    @GetMapping("/list")
    @ApiOperation("系统菜单列表")
    //@RequiresPermissions("system:osysmenu:list")
    public CommonResult list(@RequestParam Map<String, Object> params) {
        PageUtils page = oSysMenuService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }

    @MoliAspectLog(operModul = OldxConstant.MENU_MODUL, operType = "获取菜单树结构", operDesc = "菜单树结构列表")
    @GetMapping("/listTree")
    @ApiOperation("获取菜单树形结构")
    @PreAuthorize("hasAuthority('menu:list')")
    public CommonResult getMenu(Long userId) {
        List<OSysMenuEntity> sysMenuList = oSysMenuService.selectMenuList(userId);
        return CommonResult.ok("获取菜单列表成功").put("菜单列表", sysMenuList);
    }

    /**
     * 信息
     */
    @ApiOperation("查询指定菜单列表")
    @MoliAspectLog(operModul = OldxConstant.MENU_MODUL, operType = "条件查询菜单", operDesc = "查询菜单列表")
    @GetMapping("/info/{menuId}")
    //@RequiresPermissions("system:osysmenu:info")
    public CommonResult info(@PathVariable("menuId") Long menuId) {
        OSysMenuEntity oSysMenu = oSysMenuService.getById(menuId);

        return CommonResult.ok().put("oSysMenu", oSysMenu);
    }

    /**
     * 保存
     */
    @ApiOperation("新增菜单")
    @MoliAspectLog(operModul = OldxConstant.MENU_MODUL, operType = "新增菜单", operDesc = "新增菜单列表")
    @PostMapping("/save")
    //@RequiresPermissions("system:osysmenu:save")
    public CommonResult save(@RequestBody OSysMenuEntity oSysMenu) {
        oSysMenuService.save(oSysMenu);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @MoliAspectLog(operModul = OldxConstant.MENU_MODUL, operType = "修改菜单", operDesc = "修改菜单列表")
    @PostMapping("/update")
    @ApiOperation("修改菜单")
    //@RequiresPermissions("system:osysmenu:update")
    public CommonResult update(@RequestBody OSysMenuEntity oSysMenu) {
        oSysMenuService.updateById(oSysMenu);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @MoliAspectLog(operModul = OldxConstant.MENU_MODUL, operType = "批量删除菜单", operDesc = "删除菜单列表")
    @GetMapping("/delete")
    @ApiOperation("删除某个菜单")
    //@RequiresPermissions("system:osysmenu:delete")
    public CommonResult delete(@RequestBody Long[] menuIds) {
        oSysMenuService.removeByIds(Arrays.asList(menuIds));

        return CommonResult.ok();
    }

}
