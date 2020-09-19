package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSystemLogEntity;
import cc.oldx.modules.system.service.OSystemLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * @author moli
 * @email 974751082@qq.com
 * @date 2020-07-28 21:57:52
 */
@RestController
@RequestMapping("ware/osystemlog")
@Api("系统日志-log")
@RequiredArgsConstructor
public class OSystemLogController {

    private final OSystemLogService oSystemLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("日志列表查询")
    //@RequiresPermissions("ware:osystemlog:list")
    public CommonResult list(@RequestParam Map<String, Object> params) {
        PageUtils page = oSystemLogService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @ApiOperation("")
    //@RequiresPermissions("ware:osystemlog:info")
    public CommonResult info(@PathVariable("id") String id) {
        OSystemLogEntity oSystemLog = oSystemLogService.getById(id);

        return CommonResult.ok().put("oSystemLog", oSystemLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:osystemlog:save")
    public CommonResult save(@RequestBody OSystemLogEntity oSystemLog) {
        oSystemLogService.save(oSystemLog);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:osystemlog:update")
    public CommonResult update(@RequestBody OSystemLogEntity oSystemLog) {
        oSystemLogService.updateById(oSystemLog);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:osystemlog:delete")
    public CommonResult delete(@RequestBody String[] ids) {
        oSystemLogService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}
