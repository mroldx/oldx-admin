package com.oldx.web.controller;

import com.oldx.web.dao.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IndexController {
    // 图形验证码 session key
    public static final String SESSION_KEY_IMAGE_CODE = "SESSION_KEY_IMAGE_CODE";
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/")
    public String index() {
        return "login";
    }
    @RequestMapping("/loginn")
    public String login() {
        return "login111";
    }
    @RequestMapping("/error/500")
    public String qqq() {
        return "error/500";
    }

    @GetMapping("/image/code")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("验证码来了。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
    }
}
