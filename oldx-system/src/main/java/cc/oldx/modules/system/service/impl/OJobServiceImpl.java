package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OJobEntity;
import cc.oldx.mbg.mapper.OJobDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;

import cc.oldx.modules.system.service.OJobService;


@Service("oJobService")
public class OJobServiceImpl extends ServiceImpl<OJobDao, OJobEntity> implements OJobService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OJobEntity> page = this.page(
                new Query<OJobEntity>().getPage(params),
                new QueryWrapper<OJobEntity>()
        );

        return new PageUtils(page);
    }

}