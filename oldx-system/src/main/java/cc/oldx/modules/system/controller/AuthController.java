package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.RedisUtil;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.modules.security.utils.JwtTokenUtil;
import cc.oldx.modules.system.dto.OSysUserParam;
import cc.oldx.modules.system.service.OSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
    private RedisUtil redisUti;
    @Autowired
    private OSysUserService sysUserService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    private JwtTokenUtil jwtTokenUtil;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResult register(@RequestBody OSysUserParam oSysUserParam) {
        OSysUserEntity sysUser = sysUserService.register(oSysUserParam);
        if (sysUser == null) {
            return CommonResult.error("用户名已存在，请重试");
        }
        sysUserService.save(sysUser);
        return CommonResult.ok("添加成功").put("user", sysUser);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody OSysUserParam oSysUserParam) {
        String token = sysUserService.login(oSysUserParam.getUsername(), oSysUserParam.getPassword());
        if (token == null) {
            return CommonResult.error("用户名或密码错误");
        }
        Map<String, Object> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
     //   redisUti.set("moli_token",token,3600);
        return CommonResult.ok(tokenMap);
    }

    @RequestMapping(value = "/refresh/token", method = RequestMethod.POST)
    public CommonResult refresh(HttpServletRequest request) {
        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
            // 得到token
            String authToken = authHeader.substring(this.tokenHead.length());
            jwtTokenUtil.refreshToken(authToken);
            return CommonResult.ok("刷新token成功");
        }
        return CommonResult.error("刷新token失败");
    }
}
