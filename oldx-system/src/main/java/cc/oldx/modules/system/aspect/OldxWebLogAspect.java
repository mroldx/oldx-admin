package cc.oldx.modules.system.aspect;

import cc.oldx.common.annotation.MoliAspectLog;
import cc.oldx.common.utils.MrOldxUtils;
import cc.oldx.mbg.domain.OExpLogEntity;
import cc.oldx.mbg.domain.OSystemLogEntity;
import cc.oldx.modules.system.service.OExpLogService;
import cc.oldx.modules.system.service.OSystemLogService;
import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
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

    @Autowired
    private OSystemLogService oSystemLogService;
    @Autowired
    private OExpLogService oExpLogService;

    /**
     * 设置日志切人点，在有此注解的位置处切入代码
     */
    @Pointcut("@annotation(cc.oldx.common.annotation.MoliAspectLog)")
    public void pointcut() {

    }

    /**
     * 设置操作异常切入点记录异常日志 扫描所有controller包下操作
     */
    @Pointcut("execution(* cc.oldx.modules.system.controller..*.*(..))")
    public void oldxExceptionPointLog() {
    }

    @AfterReturning(value = "pointcut()", returning = "keys")
    public void saveOperLog(JoinPoint joinPoint, Object keys) {
        // 获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes
                .resolveReference(RequestAttributes.REFERENCE_REQUEST);

        OSystemLogEntity logEntity = new OSystemLogEntity();
        try {
            logEntity.setId(IdUtil.randomUUID());
            // 从切面织入点处通过反射机制获取织入点处的方法
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            // 获取切入点所在的方法
            Method method = signature.getMethod();
            // 获取操作
            MoliAspectLog opLog = method.getAnnotation(MoliAspectLog.class);
            if (opLog != null) {
                String operModul = opLog.operModul();
                String operType = opLog.operType();
                String operDesc = opLog.operDesc();
                logEntity.setModul(operModul);
                logEntity.setType(operType);
                logEntity.setO_desc(operDesc);
            }
            // 获取请求的类名
            String className = joinPoint.getTarget().getClass().getName();
            // 获取请求的方法名
            String methodName = method.getName();
            methodName = className + "." + methodName;

            logEntity.setMethod(methodName);

            // 请求的参数
            Map<String, String> rtnMap = converMap(request.getParameterMap());
            // 将参数所在的数组转换成json
            String params = JSON.toJSONString(rtnMap);
            logEntity.setRequestParam(params);
            //todo
            logEntity.setUserId(null);
            logEntity.setUsername(null);
            logEntity.setIp(MrOldxUtils.getHttpServletRequestIpAddress());
            logEntity.setUri(request.getRequestURI());
            logEntity.setCreateTime(new Date());
            //   logEntity.setOperVer(operVer);
            oSystemLogService.save(logEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 异常返回通知，用于拦截异常日志信息 连接点抛出异常后执行
     *
     * @param joinPoint 切入点
     * @param e         异常信息
     */
    @AfterThrowing(pointcut = "oldxExceptionPointLog()", throwing = "e")
    public void saveExceptionLog(JoinPoint joinPoint, Throwable e) {
        // 获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes
                .resolveReference(RequestAttributes.REFERENCE_REQUEST);

        OExpLogEntity excepLog = new OExpLogEntity();
        try {
            // 从切面织入点处通过反射机制获取织入点处的方法
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            // 获取切入点所在的方法
            Method method = signature.getMethod();
            excepLog.setId(IdUtil.randomUUID());
            // 获取请求的类名
            String className = joinPoint.getTarget().getClass().getName();
            // 获取请求的方法名
            String methodName = method.getName();
            methodName = className + "." + methodName;
            // 请求的参数
            Map<String, String> rtnMap = converMap(request.getParameterMap());
            // 将参数所在的数组转换成json
            String params = JSON.toJSONString(rtnMap);
            excepLog.setRequestParam(params);
            excepLog.setMethod(methodName);
            excepLog.setExpName(e.getClass().getName());
            excepLog.setExpMessage(stackTraceToString(e.getClass().getName(), e.getMessage(), e.getStackTrace()));
            //todo
//            excepLog.setOperUserId(UserShiroUtil.getCurrentUserLoginName());
//            excepLog.setOperUserName(UserShiroUtil.getCurrentUserName());
            excepLog.setUri(request.getRequestURI());
            excepLog.setIp(MrOldxUtils.getHttpServletRequestIpAddress());
            //  excepLog.setOperVer(operVer);
            excepLog.setCreateTime(new Date());

            oExpLogService.save(excepLog);

        } catch (Exception e2) {
            e2.printStackTrace();
        }

    }

    /**
     * 转换request 请求参数
     *
     * @param paramMap request获取的参数数组
     */
    public Map<String, String> converMap(Map<String, String[]> paramMap) {
        Map<String, String> rtnMap = new HashMap<String, String>();
        for (String key : paramMap.keySet()) {
            rtnMap.put(key, paramMap.get(key)[0]);
        }
        return rtnMap;
    }

    /**
     * 转换异常信息为字符串
     *
     * @param exceptionName    异常名称
     * @param exceptionMessage 异常信息
     * @param elements         堆栈信息
     */
    public String stackTraceToString(String exceptionName, String exceptionMessage, StackTraceElement[] elements) {
        StringBuffer strbuff = new StringBuffer();
        for (StackTraceElement stet : elements) {
            strbuff.append(stet + "\n");
        }
        String message = exceptionName + ":" + exceptionMessage + "\n\t" + strbuff.toString();
        return message;
    }
}
