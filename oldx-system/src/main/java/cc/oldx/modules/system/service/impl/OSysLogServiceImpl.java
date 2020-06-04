package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysLogEntity;
import cc.oldx.mbg.mapper.OSysLogDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;


import cc.oldx.modules.system.service.OSysLogService;


@Service("oSysLogService")
public class OSysLogServiceImpl extends ServiceImpl<OSysLogDao, OSysLogEntity> implements OSysLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysLogEntity> page = this.page(
                new Query<OSysLogEntity>().getPage(params),
                new QueryWrapper<OSysLogEntity>()
        );

        return new PageUtils(page);
    }

}