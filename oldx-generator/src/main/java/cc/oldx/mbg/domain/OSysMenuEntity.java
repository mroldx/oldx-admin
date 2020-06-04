package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Data
@TableName("o_sys_menu")
public class OSysMenuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 菜单/按钮ID
     */
    @TableId
    private Long menuId;
    /**
     * 上级菜单ID
     */
    private Long parentId;
    /**
     * 菜单/按钮名称
     */
    private String menuName;
    /**
     * 菜单URL
     */
    private String url;
    /**
     * 权限标识
     */
    private String perms;
    /**
     * 类型 0菜单 1按钮
     */
    private String type;
    /**
     * 排序
     */
    private Long orderbyNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;


    @TableField(exist = false)
    private List<OSysMenuEntity> charten;
}
