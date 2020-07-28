package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author moli
 * @email 974751082@qq.com
 * @date 2020-07-28 21:57:52
 */
@Data
@TableName("o_system_log")
public class OSystemLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志主键ID
	 */
	@TableId(value = "id",type = IdType.INPUT)
	private String id;
	/**
	 * 功能模块
	 */
	private String modul;
	/**
	 * 操作类型
	 */
	private String type;
	/**
	 * 操作描述
	 */
	private String o_desc;
	/**
	 * 请求参数
	 */
	private String requestParam;
	/**
	 * 操作人ID
	 */
	private String userId;
	/**
	 *  操作者用户名
	 */
	private String username;
	/**
	 *  操作方法
	 */
	private String  method;
	/**
	 * 请求uri
	 */
	private String uri;
	/**
	 * 请求IP
	 */
	private String ip;
	/**
	 * 操作时间
	 */
	private Date createTime;
	/**
	 *  操作版本号
	 */
	private String version;

}
