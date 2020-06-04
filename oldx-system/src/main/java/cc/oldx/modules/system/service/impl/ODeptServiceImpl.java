package cc.oldx.modules.system.service.impl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.ODeptEntity;
import cc.oldx.mbg.mapper.ODeptDao;
import cc.oldx.modules.system.service.ODeptService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<ODeptEntity> selectDeptList(ODeptEntity dept) {
        return null;
    }

    @Override
    public int updateDept(ODeptEntity dept) {
        return 0;
    }

    @Override
    public int deleteDeptById(Long deptId) {
        return 0;
    }

    @Override
    public int insertDept(ODeptEntity dept) {
        return 0;
    }

}