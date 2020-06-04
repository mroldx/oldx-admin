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

import cc.oldx.mbg.domain.OSysMenuRoleEntity;
import cc.oldx.modules.system.service.OSysMenuRoleService;
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
@RequestMapping("system/osysmenurole")
public class OSysMenuRoleController {
    @Autowired
    private OSysMenuRoleService oSysMenuRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osysmenurole:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysMenuRoleService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
    //@RequiresPermissions("system:osysmenurole:info")
    public CommonResult info(@PathVariable("roleId") Long roleId){
		OSysMenuRoleEntity oSysMenuRole = oSysMenuRoleService.getById(roleId);

        return CommonResult.ok().put("oSysMenuRole", oSysMenuRole);
    }

    /**
     * 保存
     */
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
    //@RequiresPermissions("system:osysmenurole:update")
    public CommonResult update(@RequestBody OSysMenuRoleEntity oSysMenuRole){
		oSysMenuRoleService.updateById(oSysMenuRole);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysmenurole:delete")
    public CommonResult delete(@RequestBody Long[] roleIds){
		oSysMenuRoleService.removeByIds(Arrays.asList(roleIds));

        return CommonResult.ok();
    }

}
