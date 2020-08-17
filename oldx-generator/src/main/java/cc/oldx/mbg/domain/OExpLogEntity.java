package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.context.annotation.Primary;

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
@TableName("o_exp_log")
@Primary
public class OExpLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 异常ID
	 */
	@TableId(value = "id",type = IdType.INPUT)
	private String id;
	/**
	 * 请求参数
	 */
	private String requestParam;
	/**
	 * 异常名称
	 */
	private String expName;
	/**
	 * 异常信息
	 */
	private String expMessage;
	/**
	 * 操作员ID
	 */
	private String expUserId;
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

}
