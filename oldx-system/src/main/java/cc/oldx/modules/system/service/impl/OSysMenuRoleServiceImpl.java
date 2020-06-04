package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysMenuRoleEntity;
import cc.oldx.mbg.mapper.OSysMenuRoleDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;


import cc.oldx.modules.system.service.OSysMenuRoleService;


@Service("oSysMenuRoleService")
public class OSysMenuRoleServiceImpl extends ServiceImpl<OSysMenuRoleDao, OSysMenuRoleEntity> implements OSysMenuRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysMenuRoleEntity> page = this.page(
                new Query<OSysMenuRoleEntity>().getPage(params),
                new QueryWrapper<OSysMenuRoleEntity>()
        );

        return new PageUtils(page);
    }

}