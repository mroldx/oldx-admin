package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysUserRoleEntity;
import cc.oldx.modules.system.service.OSysUserRoleService;
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
@Api("用户角色关联-userrole")
@RequestMapping("system/osysuserrole")
@RequiredArgsConstructor
public class OSysUserRoleController {

    private final OSysUserRoleService oSysUserRoleService;


    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("查询用户角色对应列表")
    //@RequiresPermissions("system:osysuserrole:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysUserRoleService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @ApiOperation("查询某个用户对应的权限")
    //@RequiresPermissions("system:osysuserrole:info")
    public CommonResult info(@PathVariable("userId") Long userId){
		OSysUserRoleEntity oSysUserRole = oSysUserRoleService.getById(userId);

        return CommonResult.ok().put("oSysUserRole", oSysUserRole);
    }

    /**
     * 保存
     */
    @ApiOperation("新增用户与对应的角色")
    @RequestMapping("/save")
    //@RequiresPermissions("system:osysuserrole:save")
    public CommonResult save(@RequestBody OSysUserRoleEntity oSysUserRole){
		oSysUserRoleService.save(oSysUserRole);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:osysuserrole:update")
    public CommonResult update(@RequestBody OSysUserRoleEntity oSysUserRole){
		oSysUserRoleService.updateById(oSysUserRole);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysuserrole:delete")
    public CommonResult delete(@RequestBody Long[] userIds){
		oSysUserRoleService.removeByIds(Arrays.asList(userIds));

        return CommonResult.ok();
    }

}
