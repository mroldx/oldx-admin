package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysMenuRoleEntity;
import cc.oldx.mbg.mapper.OSysMenuRoleDao;
import cc.oldx.modules.system.service.OSysMenuRoleService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Service("oSysMenuRoleService")
public class OSysMenuRoleServiceImpl extends ServiceImpl<OSysMenuRoleDao, OSysMenuRoleEntity> implements OSysMenuRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysMenuRoleEntity> page = this.page(
                new Query<OSysMenuRoleEntity>().getPage(params),
                new QueryWrapper<OSysMenuRoleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void deleteRoleMenusByRoleId(String[] roleIds) {
        List<String> roleList = Arrays.asList(roleIds);
        this.baseMapper.delete(new LambdaQueryWrapper<OSysMenuRoleEntity>().in(OSysMenuRoleEntity::getRoleId,roleList));

    }

    @Override
    public void deleteRoleMenusByMenuId(String[] menuIds) {
        List<String> menuList = Arrays.asList(menuIds);
        this.baseMapper.delete(new LambdaQueryWrapper<OSysMenuRoleEntity>().in(OSysMenuRoleEntity::getRoleId,menuList));
    }

}