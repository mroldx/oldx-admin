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

import cc.oldx.mbg.domain.OSysLogEntity;
import cc.oldx.modules.system.service.OSysLogService;
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
@RequestMapping("system/osyslog")
public class OSysLogController {
    @Autowired
    private OSysLogService oSysLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osyslog:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysLogService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("system:osyslog:info")
    public CommonResult info(@PathVariable("id") Long id){
		OSysLogEntity oSysLog = oSysLogService.getById(id);

        return CommonResult.ok().put("oSysLog", oSysLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("system:osyslog:save")
    public CommonResult save(@RequestBody OSysLogEntity oSysLog){
		oSysLogService.save(oSysLog);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:osyslog:update")
    public CommonResult update(@RequestBody OSysLogEntity oSysLog){
		oSysLogService.updateById(oSysLog);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osyslog:delete")
    public CommonResult delete(@RequestBody Long[] ids){
		oSysLogService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}