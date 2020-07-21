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
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        List<ODeptEntity> deptEntityList = this.baseMapper.selectList(null);

        deptEntityList.stream().filter(oDeptEntity -> oDeptEntity.getParentId() == 0
        ).map((menu) -> {
            menu.setCharten(findDeptListTree(menu, deptEntityList));
            return menu;
        }).collect(Collectors.toList());


        return deptEntityList;
    }

    public List<ODeptEntity> findDeptListTree(ODeptEntity root, List<ODeptEntity> all) {
        List<ODeptEntity> collect = all.stream().filter(oDeptEntity -> {
            return oDeptEntity.getParentId().equals(root.getDeptId());
        }).map((oDeptEntity) -> {
            oDeptEntity.setCharten(findDeptListTree(oDeptEntity, all));
            return oDeptEntity;
        }).collect(Collectors.toList());
        return collect;

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateDept(ODeptEntity dept) {
        if (dept.getParentId() == null) {
            dept.setParentId(0L);
        }
        this.baseMapper.updateById(dept);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteDeptById(Long[] deptIds) {
        this.baseMapper.deleteBatchIds(Arrays.asList(deptIds));

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertDept(ODeptEntity dept) {

        if (dept.getParentId() == null) {
            dept.setParentId(0L);
        }
        dept.setCreateTime(new Date());
        this.save(dept);
    }

}