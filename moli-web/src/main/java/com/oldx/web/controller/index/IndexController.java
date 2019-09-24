package com.oldx.web.controller.index;

import com.oldx.common.api.CommonResult;
import com.oldx.mbg.domain.MoliUser;
import com.oldx.web.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "IndexController", description = "后台用户管理")
public class IndexController {
    private Logger log = LoggerFactory.getLogger(this.getClass());



    @Autowired
    private UserService userService;

    @PreAuthorize("hasAuthority('user:list')")
    @RequestMapping(value = "/userlist", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult user() {
        MoliUser user = userService.getUserList();
        if (user == null) {
            return CommonResult.failed("发生错误");
        }
        log.info("查找用户");
        return CommonResult.success(user);
    }

    @RequestMapping(value = "/userlist1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult user111() {
        MoliUser user = userService.getUserList();
        if (user == null) {
            return CommonResult.failed("发生错误");
        }
        log.info("查找用户");
        return CommonResult.success(user);
    }



    @GetMapping("index")
    public String index(Authentication authentication, Model model) {
        model.addAttribute("user", authentication.getPrincipal());
        System.out.println(authentication.getPrincipal());
        return "index";
    }
}
