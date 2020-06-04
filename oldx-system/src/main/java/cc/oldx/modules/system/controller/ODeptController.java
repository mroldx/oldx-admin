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

import cc.oldx.mbg.domain.ODeptEntity;
import cc.oldx.modules.system.service.ODeptService;
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
@RequestMapping("system/odept")
public class ODeptController {
    @Autowired
    private ODeptService oDeptService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:odept:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oDeptService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{deptId}")
    //@RequiresPermissions("system:odept:info")
    public CommonResult info(@PathVariable("deptId") Long deptId){
        ODeptEntity oDept = oDeptService.getById(deptId);

        return CommonResult.ok().put("oDept", oDept);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("system:odept:save")
    public CommonResult save(@RequestBody ODeptEntity oDept){
		oDeptService.save(oDept);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:odept:update")
    public CommonResult update(@RequestBody ODeptEntity oDept){
		oDeptService.updateById(oDept);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:odept:delete")
    public CommonResult delete(@RequestBody Long[] deptIds){
		oDeptService.removeByIds(Arrays.asList(deptIds));

        return CommonResult.ok();
    }

}
