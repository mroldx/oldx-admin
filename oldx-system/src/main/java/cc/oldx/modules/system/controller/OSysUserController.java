package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.modules.system.service.OSysUserService;
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
@RequestMapping("system/osysuser")
@Api("用户-sysuser")
@RequiredArgsConstructor
public class OSysUserController {

    private final OSysUserService oSysUserService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation("条件查询用户列表")
    //@RequiresPermissions("system:osysuser:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysUserService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @ApiOperation("查询某个用户")
    //@RequiresPermissions("system:osysuser:info")
    public CommonResult info(@PathVariable("userId") Long userId){
		OSysUserEntity oSysUser = oSysUserService.getById(userId);

        return CommonResult.ok().put("oSysUser", oSysUser);
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation("修改某个用户")
    //@RequiresPermissions("system:osysuser:update")
    public CommonResult update(@RequestBody OSysUserEntity oSysUser){
		oSysUserService.updateById(oSysUser);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除某个用户")
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysuser:delete")
    public CommonResult delete(@RequestBody Long[] userIds){
		oSysUserService.removeByIds(Arrays.asList(userIds));

        return CommonResult.ok();
    }

}
