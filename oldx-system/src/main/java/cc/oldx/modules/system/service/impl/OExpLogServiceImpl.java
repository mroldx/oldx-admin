package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OExpLogEntity;
import cc.oldx.mbg.mapper.OExpLogDao;
import cc.oldx.modules.system.service.OExpLogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("oExpLogService")
public class OExpLogServiceImpl extends ServiceImpl<OExpLogDao, OExpLogEntity> implements OExpLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OExpLogEntity> page = this.page(
                new Query<OExpLogEntity>().getPage(params),
                new QueryWrapper<OExpLogEntity>()
        );

        return new PageUtils(page);
    }

}