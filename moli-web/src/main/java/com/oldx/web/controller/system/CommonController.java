package com.oldx.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

    @RequestMapping(value = "/exception/403",method = RequestMethod.GET)
    public String unAuthorin(){
        return "/exception/403";
    }
}
