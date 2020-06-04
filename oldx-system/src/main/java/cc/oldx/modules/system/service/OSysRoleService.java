package cc.oldx.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysRoleEntity;

import java.util.Map;

/**
 * 角色表
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysRoleService extends IService<OSysRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

