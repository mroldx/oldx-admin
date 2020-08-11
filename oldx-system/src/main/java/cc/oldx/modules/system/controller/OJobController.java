package cc.oldx.modules.system.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.oldx.mbg.domain.OJobEntity;
import cc.oldx.modules.system.service.OJobService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.CommonResult;



/**
 * 岗位
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@Api("定时任务-ojob")
@RequestMapping("system/ojob")
public class OJobController {
    @Autowired
    private OJobService oJobService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("定时任务列表")
    //@RequiresPermissions("system:ojob:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oJobService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @ApiOperation("查询某个定时任务")
    //@RequiresPermissions("system:ojob:info")
    public CommonResult info(@PathVariable("id") Long id){
		OJobEntity oJob = oJobService.getById(id);

        return CommonResult.ok().put("oJob", oJob);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @ApiOperation("新增定时任务")
    //@RequiresPermissions("system:ojob:save")
    public CommonResult save(@RequestBody OJobEntity oJob){
		oJobService.save(oJob);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation("更新定时任务")
    //@RequiresPermissions("system:ojob:update")
    public CommonResult update(@RequestBody OJobEntity oJob){
		oJobService.updateById(oJob);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ApiOperation("删除定时任务")
    //@RequiresPermissions("system:ojob:delete")
    public CommonResult delete(@RequestBody Long[] ids){
		oJobService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}
