package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 角色表
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Data
@TableName("o_sys_role")
public class OSysRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 角色名称
	 */
	@NotEmpty
	private String roleName;
	/**
	 * 角色编码
	 */
	@NotEmpty
	private String roleCode;
	/**
	 * 描述
	 */
	@NotEmpty
	private String description;
	/**
	 * 创建人
	 */
	@NotEmpty
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
