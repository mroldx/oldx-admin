package com.oldx.web.controller;

import com.oldx.common.api.CommonResult;
import com.oldx.mbg.domain.MoliUser;
import com.oldx.web.dao.UserRepository;
import com.oldx.web.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Api(tags = "IndexController", description = "后台用户管理")
public class IndexController {
    // 图形验证码 session key
    public static final String SESSION_KEY_IMAGE_CODE = "SESSION_KEY_IMAGE_CODE";
    @Autowired
    private UserRepository userRepository;

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    private Logger log = LoggerFactory.getLogger(this.getClass());

    private RequestCache requestCache = new HttpSessionRequestCache();

   /* @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }*/

    @RequestMapping(value = "/error/500", method = RequestMethod.POST)
    public String qqq() {
        return "error/500";
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/image/code1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult createCode(MoliUser moliUser) {
        System.out.println("验证码来了。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
        MoliUser user = userService.insertUser(moliUser);
        if (user == null) {
            return CommonResult.failed("用户名已存在添加失败");
        }
        log.info("添加用户成功");
        return CommonResult.success(user);
    }

    @PostMapping("insertUser")
    @ResponseBody
    public CommonResult user(MoliUser moliUser) {
        MoliUser user = userService.insertUser(moliUser);
        if (user == null) {
            return CommonResult.failed("用户名已存在添加失败");
        }
        log.info("添加用户成功");
        return CommonResult.success(user);
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest != null) {
            String redirectUrl = savedRequest.getRedirectUrl();
            log.info("引发跳转的请求是：{}", redirectUrl);
        }
        return "2";
    }
}
