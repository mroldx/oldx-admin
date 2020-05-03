package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.ODept;
import cc.oldx.mbg.domain.ODeptExample;
import cc.oldx.mbg.mapper.ODeptMapper;
import cc.oldx.modules.system.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/5/3 23:38
 */
@Service("sysDeptService")
public class SysDeptServiceImpl implements SysDeptService {
    @Autowired
    private ODeptMapper oDeptMapper;
    @Override
    public List<ODept> selectDeptList(ODept dept) {
        return oDeptMapper.selectDeptList(dept);
    }

    @Override
    public int updateDept(ODept dept) {
        ODeptExample oDeptExample=new ODeptExample();
        oDeptExample.createCriteria().andDeptIdEqualTo(dept.getDeptId());

        return oDeptMapper.updateByExampleSelective(dept,oDeptExample);
    }

    @Override
    public int deleteDeptById(Long deptId) {
        return oDeptMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int insertDept(ODept dept) {
        dept.setCreateTime(new Date());

        return oDeptMapper.insert(dept);
    }
}
