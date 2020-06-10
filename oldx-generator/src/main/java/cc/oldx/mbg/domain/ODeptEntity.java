package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Data
@TableName("o_dept")
public class ODeptEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门ID
	 */
	@TableId
	private Long deptId;
	/**
	 * 上级部门ID
	 */
	@NotEmpty
	private Long parentId;
	/**
	 * 部门名称
	 */
	@NotEmpty
	private String deptName;
	/**
	 * 排序
	 */
	@NotEmpty
	private Long orderMun;
	/**
	 * 创建时间
	 */
	@NotEmpty
	private Date createTime;

}
