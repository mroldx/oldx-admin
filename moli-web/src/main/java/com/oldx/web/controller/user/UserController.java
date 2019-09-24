package com.oldx.web.controller.user;

import com.oldx.common.api.CommonResult;
import com.oldx.common.api.PageRequest;
import com.oldx.mbg.domain.MoliUser;
import com.oldx.web.controller.base.BaseController;
import com.oldx.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    private Logger log = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult registerMUser(MoliUser moliUser) {

        MoliUser user = this.userService.insertUser(moliUser);
        if (user == null) {
            return CommonResult.failed("用户名已存在添加失败");
        }
        log.info("添加用户成功！用户名为" + user.getUsername());
        return CommonResult.success(user);
    }

    @PreAuthorize("hasAuthority('user:update')")
    @RequestMapping(value = "user/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMUser(MoliUser user, Long[] roles) {
        try {
            if ("1".equalsIgnoreCase(user.getStatus()))
                user.setStatus(MoliUser.STATUS_VALID);
            else
                user.setStatus(MoliUser.STATUS_LOCK);
            this.userService.updateMUser(user, roles);
            return CommonResult.success(null, "修改用户成功！");
        } catch (Exception e) {
            log.error("修改用户失败", e);
            return CommonResult.failed("修改用户失败，请联系管理员！");
        }
    }

    @PreAuthorize("hasAuthority('user:list')")
    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> userList(PageRequest request, MoliUser user) {
        return super.selectByPageNumSize(request, () -> this.userService.findAllMUserWithDept(user));
    }

}
