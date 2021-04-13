package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.modules.system.service.AmapClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/17 4:48
 */
@RestController
@RequiredArgsConstructor
@Api("首页")
public class IndexController {


    private final AmapClient amapClient;

    @RequestMapping(value = "/map_test",method = RequestMethod.POST)
    public CommonResult aa() {
        Map result = amapClient.getLocation("121.475078", "31.223577");
        System.out.println(result);
        return CommonResult.ok(result);
    }

    @GetMapping("/t/t")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @ApiOperation("测试1")
    public String tre() {
        return "dasdasdasdsad";
    }

    @GetMapping("/tt")
    @ApiOperation("测试1-权限 user-add")
    @PreAuthorize("hasAuthority('user:add')")
    public String trweqwee() {
        return "dasdasdasdsad";
    }
}
