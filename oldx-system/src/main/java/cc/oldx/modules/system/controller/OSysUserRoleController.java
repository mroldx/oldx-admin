package cc.oldx.modules.system.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.oldx.mbg.domain.OSysUserRoleEntity;
import cc.oldx.modules.system.service.OSysUserRoleService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.CommonResult;



/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@RequestMapping("system/osysuserrole")
public class OSysUserRoleController {
    @Autowired
    private OSysUserRoleService oSysUserRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osysuserrole:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysUserRoleService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    //@RequiresPermissions("system:osysuserrole:info")
    public CommonResult info(@PathVariable("userId") Long userId){
		OSysUserRoleEntity oSysUserRole = oSysUserRoleService.getById(userId);

        return CommonResult.ok().put("oSysUserRole", oSysUserRole);
    }

    /**
     * 保存
     */
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
