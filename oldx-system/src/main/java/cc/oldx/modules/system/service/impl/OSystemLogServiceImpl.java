package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSystemLogEntity;
import cc.oldx.mbg.mapper.OSystemLogDao;
import cc.oldx.modules.system.service.OSystemLogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("oSystemLogService")
public class OSystemLogServiceImpl extends ServiceImpl<OSystemLogDao, OSystemLogEntity> implements OSystemLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSystemLogEntity> page = this.page(
                new Query<OSystemLogEntity>().getPage(params),
                new QueryWrapper<OSystemLogEntity>()
        );

        return new PageUtils(page);
    }

}