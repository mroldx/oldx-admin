

package cc.oldx.common.exception;

import cc.oldx.common.utils.CommonResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 异常处理器
 *
 * @author MrOldx
 */
@RestControllerAdvice
public class OldxExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(GlobaException.class)
	public CommonResult handleRRException(GlobaException e){
		CommonResult r = new CommonResult();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public CommonResult handlerNoFoundException(Exception e) {
		logger.error(e.getMessage(), e);
		return CommonResult.error(404, "路径不存在，请检查路径是否正确");
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public CommonResult handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return CommonResult.error("数据库中已存在该记录");
	}

	@ExceptionHandler(Exception.class)
	public CommonResult handleException(Exception e){
		logger.error(e.getMessage(), e);
		return CommonResult.error();
	}
}
