package cc.oldx.modules.system.controller;

import cc.oldx.common.annotation.MoliAspectLog;
import cc.oldx.common.constant.OldxConstant;
import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.ODeptEntity;
import cc.oldx.modules.system.service.ODeptService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("system/odept")
public class ODeptController {
    @Autowired
    private ODeptService oDeptService;

    /**
     * 列表
     */
    @MoliAspectLog(operModul = OldxConstant.DEPT_MODUL,operType = "部门查询列表",operDesc = "查询部门所有人员")
    @RequestMapping("/list")
    //@RequiresPermissions("system:odept:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oDeptService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @MoliAspectLog(operModul = OldxConstant.DEPT_MODUL,operType = "部门查询单个",operDesc = "查询某个ID的信息")
    @RequestMapping("/info/{deptId}")
    //@RequiresPermissions("system:odept:info")
    public CommonResult info(@PathVariable("deptId") Long deptId){
        ODeptEntity oDept = oDeptService.getById(deptId);

        return CommonResult.ok().put("oDept", oDept);
    }

    /**
     * 保存
     */
    @MoliAspectLog(operModul = OldxConstant.DEPT_MODUL,operType = "部门保存",operDesc = "保存人员")
    @RequestMapping("/save")
    //@RequiresPermissions("system:odept:save")
    public CommonResult save(@RequestBody ODeptEntity oDept){
		oDeptService.save(oDept);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @MoliAspectLog(operModul = OldxConstant.DEPT_MODUL,operType = "部门修改",operDesc = "修改部门")
    @RequestMapping("/update")
    //@RequiresPermissions("system:odept:update")
    public CommonResult update(@RequestBody ODeptEntity oDept){
		oDeptService.updateById(oDept);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @MoliAspectLog(operModul = OldxConstant.DEPT_MODUL,operType = "删除某个部门",operDesc = "删除部门")
    @RequestMapping("/delete")
    //@RequiresPermissions("system:odept:delete")
    public CommonResult delete(@RequestBody Long[] deptIds){
		oDeptService.removeByIds(Arrays.asList(deptIds));

        return CommonResult.ok();
    }

}
