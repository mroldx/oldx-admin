package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysMenuRoleEntity;
import cc.oldx.mbg.domain.OSysRoleEntity;
import cc.oldx.mbg.mapper.OSysRoleDao;
import cc.oldx.modules.system.service.OSysMenuRoleService;
import cc.oldx.modules.system.service.OSysRoleService;
import cc.oldx.modules.system.service.OSysUserRoleService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("oSysRoleService")
public class OSysRoleServiceImpl extends ServiceImpl<OSysRoleDao, OSysRoleEntity> implements OSysRoleService {
    @Autowired
    private OSysMenuRoleService oSysMenuRoleService;
    @Autowired
    private OSysUserRoleService oSysUserRoleService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysRoleEntity> page = this.page(
                new Query<OSysRoleEntity>().getPage(params),
                new QueryWrapper<OSysRoleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<OSysRoleEntity> getRoleByUserName(String username) {
        return baseMapper.findUserRoleByUserName(username);
    }

    @Override
    public List<OSysRoleEntity> findAllRoles() {
        LambdaQueryWrapper<OSysRoleEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(OSysRoleEntity::getId);
        return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    public OSysRoleEntity findByName(String roleName) {

        return baseMapper.selectOne(new LambdaQueryWrapper<OSysRoleEntity>().eq(OSysRoleEntity::getRoleName, roleName));
    }

    @Override
    public void createRole(OSysRoleEntity role) {
        role.setCreateTime(new Date());
        this.save(role);

        if (StringUtils.isNotBlank(role.getMenuIds())) {
            String[] menuIds = StringUtils.splitByWholeSeparatorPreserveAllTokens(role.getMenuIds(), ",");
            setRoleMenus(role, menuIds);
        }
    }

    private void setRoleMenus(OSysRoleEntity role, String[] menuIds) {
        List<OSysMenuRoleEntity> roleMenus = new ArrayList<>();
        Arrays.stream(menuIds).forEach(menuId -> {
            OSysMenuRoleEntity roleMenu = new OSysMenuRoleEntity();
            if (StringUtils.isNotBlank(menuId)) {
                roleMenu.setMenuId(Long.valueOf(menuId));
            }
            roleMenu.setRoleId(role.getId());
            roleMenus.add(roleMenu);
        });
        this.oSysMenuRoleService.saveBatch(roleMenus);
    }

    @Override
    public void deleteRoles(String[] roleIds) {
        List<String> roleList = Arrays.asList(roleIds);
        this.baseMapper.deleteBatchIds(roleList);

        this.oSysMenuRoleService.deleteRoleMenusByRoleId(roleIds);
        this.oSysUserRoleService.deleteUserRolesByRoleId(roleIds);
    }

    @Override
    public void updateRole(OSysRoleEntity role) {
        role.setRoleName(null);
        role.setUpdateTime(new Date());
        baseMapper.updateById(role);

        oSysMenuRoleService.remove(new LambdaQueryWrapper<OSysMenuRoleEntity>().eq(OSysMenuRoleEntity::getRoleId, role.getId()));
        if (StringUtils.isNotBlank(role.getMenuIds())) {
            String[] menuIds = StringUtils.splitByWholeSeparatorPreserveAllTokens(role.getMenuIds(), ",");
            setRoleMenus(role, menuIds);
        }
    }

}