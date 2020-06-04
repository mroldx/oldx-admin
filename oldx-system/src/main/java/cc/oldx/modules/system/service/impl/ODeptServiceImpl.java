package cc.oldx.modules.system.service.impl;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;

import cc.oldx.mbg.mapper.ODeptDao;
import cc.oldx.mbg.domain.ODeptEntity;
import cc.oldx.modules.system.service.ODeptService;

@Service("oDeptService")
public class ODeptServiceImpl extends ServiceImpl<ODeptDao, ODeptEntity> implements ODeptService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ODeptEntity> page = this.page(
                new Query<ODeptEntity>().getPage(params),
                new QueryWrapper<ODeptEntity>()
        );

        return new PageUtils(page);
    }

}