package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysUserRoleEntity;
import cc.oldx.mbg.mapper.OSysUserRoleDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;


import cc.oldx.modules.system.service.OSysUserRoleService;


@Service("oSysUserRoleService")
public class OSysUserRoleServiceImpl extends ServiceImpl<OSysUserRoleDao, OSysUserRoleEntity> implements OSysUserRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysUserRoleEntity> page = this.page(
                new Query<OSysUserRoleEntity>().getPage(params),
                new QueryWrapper<OSysUserRoleEntity>()
        );

        return new PageUtils(page);
    }

}