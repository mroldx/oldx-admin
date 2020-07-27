package cc.oldx.common.aspect;

import cc.oldx.common.utils.CommonResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: MrOldx <br/>
 * @Descrption: 全局日志切面
 * @Date:Created in 15:09 2020/7/27  <br/>
 */

@Aspect
@Component
public class OldxWebLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(OldxWebLogAspect.class);
    private static final ThreadLocal<Long> timeTreadLocal = new ThreadLocal<>();


}
