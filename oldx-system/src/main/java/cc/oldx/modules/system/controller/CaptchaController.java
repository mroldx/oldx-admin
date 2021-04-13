package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.RedisUtil;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.utils.CaptchaUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/9/22 15:54
 */
@Controller
@RequiredArgsConstructor
public class CaptchaController {

    private final StringRedisTemplate redisTemplate;
    private final RedisUtil redisUtil;

    @GetMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.out(request, response);
    }

    @ResponseBody
    @GetMapping("/captcha_redis")
    public CommonResult captcha_redis(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
        String verCode = specCaptcha.text().toLowerCase();
        String key = UUID.randomUUID().toString();
        // 存入redis并设置过期时间为30秒
        redisUtil.set(key, verCode, 30);
        // 将key和base64返回给前端
        return CommonResult.ok().put("key", key).put("image", specCaptcha.toBase64());
    }


    @ResponseBody
    @RequestMapping(value = "/limitout",method = RequestMethod.POST)
    public CommonResult get_1oo() {

        if (redisTemplate.hasKey("limit")) {
            int limit = Integer.parseInt(redisTemplate.opsForValue().get("limit").toString());
            long forExpire = redisTemplate.getExpire("limit");
            if (forExpire > -1) {
                if (limit >=50) {
                    return CommonResult.error("一分钟之内超过50此访问");
                } else {
                    increValue("limit");
                    return CommonResult.ok("访问成功");
                }
            } else {
                redisTemplate.delete("limit");
            }
        }
        redisTemplate.opsForValue().set("limit", "0", 60, TimeUnit.SECONDS);
        return CommonResult.ok("访问成功");
    }

    public Integer increValue(String key) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        try {
            valueOperations.increment(key, 1);
            System.out.println("key自增=" + valueOperations.get(key));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Integer.parseInt(valueOperations.get(key));
    }
}