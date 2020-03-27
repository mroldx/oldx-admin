package cc.oldx.modules.system.controller;

import cc.oldx.common.api.CommonResult;
import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.modules.system.dto.OSysUserParam;
import cc.oldx.modules.system.service.OAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 14:42
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
     @Autowired
    private OAdminService OadminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResult<OSysUser> register(@RequestBody OSysUserParam oSysUserParam){
        OSysUser sysUser = OadminService.register(oSysUserParam);
        if(sysUser==null){
          return CommonResult.failed("用户名已存在，请重试");
        }
        return CommonResult.success(sysUser);
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody OSysUserParam oSysUserParam){
        String token=OadminService.login(oSysUserParam.getUsername(),oSysUserParam.getPassword());
        if(token==null){
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }
}
