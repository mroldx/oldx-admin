package cc.oldx.common.utils;

import cc.oldx.common.api.IErrorCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2019年10月27日 下午9:59:27
 */
public class CommonResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public CommonResult() {
		put("code", 0);
	}
	
	public static CommonResult error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static CommonResult error(String msg) {
		return error(500, msg);
	}
	
	public static CommonResult error(int code, String msg) {
		CommonResult r = new CommonResult();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static CommonResult ok(String msg) {
		CommonResult r = new CommonResult();
		r.put("msg", msg);
		r.put("code", 200);
		return r;
	}
	public static CommonResult faild(IErrorCode errorCode,Object msg){
		CommonResult r = new CommonResult();
		r.put("msg", msg);
		r.put("code", errorCode);
		return r;
	}
	
	public static CommonResult ok(Map<String, Object> map) {
		CommonResult r = new CommonResult();
		r.putAll(map);
		return r;
	}
	
	public static CommonResult ok() {
		return new CommonResult();
	}

	public CommonResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
