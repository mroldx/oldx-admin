package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysRoleEntity;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.mbg.mapper.OSysRoleDao;
import cc.oldx.modules.system.service.OSysRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("oSysRoleService")
public class OSysRoleServiceImpl extends ServiceImpl<OSysRoleDao, OSysRoleEntity> implements OSysRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysRoleEntity> page = this.page(
                new Query<OSysRoleEntity>().getPage(params),
                new QueryWrapper<OSysRoleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void addUserWithRole(OSysUserEntity user, String roles) {

    }

    @Override
    public void editUserWithRole(OSysUserEntity user, String roles) {

    }

    @Override
    public List<String> getRole(String username) {
        return null;
    }

}