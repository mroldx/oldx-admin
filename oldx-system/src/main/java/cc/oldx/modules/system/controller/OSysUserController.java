package cc.oldx.modules.system.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.modules.system.service.OSysUserService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.CommonResult;

import javax.validation.Valid;


/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@RequestMapping("system/osysuser")
public class OSysUserController {
    @Autowired
    private OSysUserService oSysUserService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osysuser:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysUserService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    //@RequiresPermissions("system:osysuser:info")
    public CommonResult info(@PathVariable("userId") Long userId){
		OSysUserEntity oSysUser = oSysUserService.getById(userId);

        return CommonResult.ok().put("oSysUser", oSysUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("system:osysuser:save")
    public CommonResult save(@Valid @RequestBody OSysUserEntity oSysUser, BindingResult result){
        if(result.hasErrors()){
            Map<Object, Object> map = new HashMap<>();
            result.getFieldErrors().forEach((item)->{
                String message = item.getDefaultMessage();
                String field = item.getField();
                map.put(message,field);
            });
            return CommonResult.error("出现错误").put("data",map);
        }else {

        }
		oSysUserService.save(oSysUser);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:osysuser:update")
    public CommonResult update(@RequestBody OSysUserEntity oSysUser){
		oSysUserService.updateById(oSysUser);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysuser:delete")
    public CommonResult delete(@RequestBody Long[] userIds){
		oSysUserService.removeByIds(Arrays.asList(userIds));

        return CommonResult.ok();
    }

}
