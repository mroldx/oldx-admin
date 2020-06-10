package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OSysMenuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface OSysMenuService extends IService<OSysMenuEntity> {

    PageUtils queryPage(Map<String, Object> params);


    public String findUserPermissions(String userName);


    public List<OSysMenuEntity> selectMenuList(Long userId);
}

