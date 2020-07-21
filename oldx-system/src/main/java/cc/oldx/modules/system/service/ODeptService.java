package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.ODeptEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
public interface ODeptService extends IService<ODeptEntity> {

    PageUtils queryPage(Map<String, Object> params);


    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<ODeptEntity> selectDeptList(ODeptEntity dept);

    /**
     * 修改部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public void updateDept(ODeptEntity dept);

    /**
     * 删除部门管理信息
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public void deleteDeptById(Long[] deptIds);

    /**
     * 新增部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public void insertDept(ODeptEntity dept);
}

