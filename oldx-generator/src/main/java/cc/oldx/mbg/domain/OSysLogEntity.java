package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.context.annotation.Primary;

/**
 * 
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Data
@TableName("o_sys_log")
@Primary
public class OSysLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志ID
	 */
	@TableId
	private Long id;
	/**
	 * 操作用户
	 */
	private String username;
	/**
	 * 操作内容
	 */
	private String operation;
	/**
	 * 耗时
	 */
	private BigDecimal time;
	/**
	 * 操作方法
	 */
	private String method;
	/**
	 * 方法参数
	 */
	private String params;
	/**
	 * 操作者IP
	 */
	private String ip;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 操作地点
	 */
	private String location;

}
