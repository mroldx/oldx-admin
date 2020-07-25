package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.mbg.domain.OSysUserRoleEntity;
import cc.oldx.mbg.mapper.OSysUserRoleDao;
import cc.oldx.modules.system.service.OSysUserRoleService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Service("oSysUserRoleService")
public class OSysUserRoleServiceImpl extends ServiceImpl<OSysUserRoleDao, OSysUserRoleEntity> implements OSysUserRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysUserRoleEntity> page = this.page(
                new Query<OSysUserRoleEntity>().getPage(params),
                new QueryWrapper<OSysUserRoleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void addUserWithRole(OSysUserEntity user, String roles) {
        Long userId = user.getUserId();
        OSysUserRoleEntity oSysRoleEntity=new OSysUserRoleEntity();
        oSysRoleEntity.setUserId(userId);
        oSysRoleEntity.setRoleId(Long.valueOf(roles));
        this.baseMapper.insert(oSysRoleEntity);

    }

    @Override
    public void editUserWithRole(OSysUserEntity user, String roles) {

    }

    @Override
    public void deleteUserRolesByRoleId(String[] roleIds) {
        List<String> list = Arrays.asList(roleIds);
        this.baseMapper.delete(new LambdaQueryWrapper<OSysUserRoleEntity>().in(OSysUserRoleEntity::getRoleId,list));
    }

    @Override
    public void deleteUserRolesByUserId(String[] userIds) {
        List<String> list = Arrays.asList(userIds);
        this.baseMapper.delete(new LambdaQueryWrapper<OSysUserRoleEntity>().in(OSysUserRoleEntity::getUserId, list));
    }
}