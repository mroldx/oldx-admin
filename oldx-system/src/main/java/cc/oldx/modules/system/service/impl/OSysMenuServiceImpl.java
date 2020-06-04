package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysMenuEntity;
import cc.oldx.mbg.mapper.OSysMenuDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;


import cc.oldx.modules.system.service.OSysMenuService;


@Service("oSysMenuService")
public class OSysMenuServiceImpl extends ServiceImpl<OSysMenuDao, OSysMenuEntity> implements OSysMenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysMenuEntity> page = this.page(
                new Query<OSysMenuEntity>().getPage(params),
                new QueryWrapper<OSysMenuEntity>()
        );

        return new PageUtils(page);
    }

}