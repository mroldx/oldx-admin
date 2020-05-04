package cc.oldx.common.exception;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import cc.oldx.common.api.CommonResult;


/**
 * 全局异常处理器
 * 
 * @author moli
 */
@RestControllerAdvice
public class GlobalExceptionHandler
{
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 基础异常的实现
     */
    @ExceptionHandler(BaseException.class)
    public CommonResult baseException(BaseException e)
    {
        return CommonResult.error(e.getMessage());
    }

    /**
     * 业务异常
     */
    @ExceptionHandler(CustomException.class)
    public CommonResult businessException(CustomException e)
    {
        if (StringUtils.isNull(e.getCode()))
        {
            return CommonResult.error(e.getMessage());
        }
        return CommonResult.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public CommonResult handlerNoFoundException(Exception e)
    {
        log.error(e.getMessage(), e);
        return CommonResult.error(HttpStatus.NOT_FOUND, "路径不存在，请检查路径是否正确");
    }

    @ExceptionHandler(AccessDeniedException.class)
    public CommonResult handleAuthorizationException(AccessDeniedException e)
    {
        log.error(e.getMessage());
        return CommonResult.error(HttpStatus.FORBIDDEN, "没有权限，请联系管理员授权");
    }

    @ExceptionHandler(AccountExpiredException.class)
    public CommonResult handleAccountExpiredException(AccountExpiredException e)
    {
        log.error(e.getMessage(), e);
        return CommonResult.error(e.getMessage());
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public CommonResult handleUsernameNotFoundException(UsernameNotFoundException e)
    {
        log.error(e.getMessage(), e);
        return CommonResult.error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public CommonResult handleException(Exception e)
    {
        log.error(e.getMessage(), e);
        return CommonResult.error(e.getMessage());
    }

    /**
     * 自定义验证异常
     */
    @ExceptionHandler(BindException.class)
    public CommonResult validatedBindException(BindException e)
    {
        log.error(e.getMessage(), e);
        String message = e.getAllErrors().get(0).getDefaultMessage();
        return CommonResult.error(message);
    }

    /**
     * 自定义验证异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object validExceptionHandler(MethodArgumentNotValidException e)
    {
        log.error(e.getMessage(), e);
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        return CommonResult.error(message);
    }

    /**
     * 演示模式异常
     */
    @ExceptionHandler(DemoModeException.class)
    public CommonResult demoModeException(DemoModeException e)
    {
        return CommonResult.failed("演示模式，不允许操作");
    }
}
