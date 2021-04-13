package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysLogEntity;
import cc.oldx.modules.system.service.OSysLogService;
import io.swagger.annotations.Api;
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
@RequestMapping("system/osyslog")
@Api("log")
@RequiredArgsConstructor
public class OSysLogController {

    private final OSysLogService oSysLogService;

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("system:osyslog:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysLogService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    //@RequiresPermissions("system:osyslog:info")
    public CommonResult info(@PathVariable("id") Long id){
		OSysLogEntity oSysLog = oSysLogService.getById(id);

        return CommonResult.ok().put("oSysLog", oSysLog);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("system:osyslog:save")
    public CommonResult save(@RequestBody OSysLogEntity oSysLog){
		oSysLogService.save(oSysLog);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    //@RequiresPermissions("system:osyslog:update")
    public CommonResult update(@RequestBody OSysLogEntity oSysLog){
		oSysLogService.updateById(oSysLog);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    //@RequiresPermissions("system:osyslog:delete")
    public CommonResult delete(@RequestBody Long[] ids){
		oSysLogService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}
