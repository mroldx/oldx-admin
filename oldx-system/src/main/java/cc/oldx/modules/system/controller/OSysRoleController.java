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

import cc.oldx.mbg.domain.OSysRoleEntity;
import cc.oldx.modules.system.service.OSysRoleService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.CommonResult;



/**
 * 角色表
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@RequestMapping("system/osysrole")
public class OSysRoleController {
    @Autowired
    private OSysRoleService oSysRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osysrole:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysRoleService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("system:osysrole:info")
    public CommonResult info(@PathVariable("id") Long id){
		OSysRoleEntity oSysRole = oSysRoleService.getById(id);

        return CommonResult.ok().put("oSysRole", oSysRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("system:osysrole:save")
    public CommonResult save(@RequestBody OSysRoleEntity oSysRole){
		oSysRoleService.save(oSysRole);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:osysrole:update")
    public CommonResult update(@RequestBody OSysRoleEntity oSysRole){
		oSysRoleService.updateById(oSysRole);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysrole:delete")
    public CommonResult delete(@RequestBody Long[] ids){
		oSysRoleService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}
