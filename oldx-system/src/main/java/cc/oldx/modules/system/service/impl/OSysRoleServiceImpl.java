package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysRoleEntity;
import cc.oldx.mbg.mapper.OSysRoleDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;


import cc.oldx.modules.system.service.OSysRoleService;


@Service("oSysRoleService")
public class OSysRoleServiceImpl extends ServiceImpl<OSysRoleDao, OSysRoleEntity> implements OSysRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysRoleEntity> page = this.page(
                new Query<OSysRoleEntity>().getPage(params),
                new QueryWrapper<OSysRoleEntity>()
        );

        return new PageUtils(page);
    }

}