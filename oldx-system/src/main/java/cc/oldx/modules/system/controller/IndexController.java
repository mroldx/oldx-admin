package cc.oldx.modules.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/17 4:48
 */
@RestController
@Api("首页")
public class IndexController {
    @RequestMapping("/t/t")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @ApiOperation("测试1")
    public String tre(){
        return "dasdasdasdsad";
    }
    @RequestMapping("/tt")
    @ApiOperation("测试1-权限 user-add")
    @PreAuthorize("hasAuthority('user:add')")
    public String trweqwee(){
        return "dasdasdasdsad";
    }
}
