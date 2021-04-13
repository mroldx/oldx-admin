package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysMenuRoleEntity;
import cc.oldx.modules.system.service.OSysMenuRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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
@Api("角色权限-role")
@RequestMapping("system/osysmenurole")
@RequiredArgsConstructor
public class OSysMenuRoleController {

    private  final OSysMenuRoleService oSysMenuRoleService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation("角色菜单列表")
    //@RequiresPermissions("system:osysmenurole:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysMenuRoleService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("查询某个角色对应的权限")
    @RequestMapping("/info/{roleId}")
    //@RequiresPermissions("system:osysmenurole:info")
    public CommonResult info(@PathVariable("roleId") Long roleId){
		OSysMenuRoleEntity oSysMenuRole = oSysMenuRoleService.getById(roleId);

        return CommonResult.ok().put("oSysMenuRole", oSysMenuRole);
    }

    /**
     * 保存
     */
    @ApiOperation("新增角色与所对应的菜单权限")
    @RequestMapping("/save")
    //@RequiresPermissions("system:osysmenurole:save")
    public CommonResult save(@RequestBody OSysMenuRoleEntity oSysMenuRole){
		oSysMenuRoleService.save(oSysMenuRole);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation("修改某个角色与权限")
    //@RequiresPermissions("system:osysmenurole:update")
    public CommonResult update(@RequestBody OSysMenuRoleEntity oSysMenuRole){
		oSysMenuRoleService.updateById(oSysMenuRole);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ApiOperation("删除某个角色对应的权限")
    //@RequiresPermissions("system:osysmenurole:delete")
    public CommonResult delete(@RequestBody Long[] roleIds){
		oSysMenuRoleService.removeByIds(Arrays.asList(roleIds));

        return CommonResult.ok();
    }

}
