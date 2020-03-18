package cc.oldx.modules.system.controller;

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
public class IndexController {
    @RequestMapping("/t/t")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String tre(){
        return "dasdasdasdsad";
    }
    @RequestMapping("/tt")
    @PreAuthorize("hasAuthority('user:add')")
    public String trweqwee(){
        return "dasdasdasdsad";
    }
}
