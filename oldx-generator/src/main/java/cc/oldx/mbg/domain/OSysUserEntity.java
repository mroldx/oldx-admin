package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Data
@TableName("o_sys_user")
public class OSysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId
	private Long userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 部门ID
	 */
	private Long deptId;
	/**
	 * 职位ID
	 */
	private Long jobId;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 联系电话
	 */
	private String moble;
	/**
	 * 状态 0锁定 1有效
	 */
	private String status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 最近访问时间
	 */
	private Date lastLoginTime;
	/**
	 * 性别 0男 1女
	 */
	private String sex;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 描述
	 */
	private String description;

}
