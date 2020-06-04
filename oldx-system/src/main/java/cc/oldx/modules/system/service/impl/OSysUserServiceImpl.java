package cc.oldx.modules.system.service.impl;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.mbg.mapper.OSysUserDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.modules.system.service.OSysUserService;

@Service("oSysUserService")
public class OSysUserServiceImpl extends ServiceImpl<OSysUserDao, OSysUserEntity> implements OSysUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysUserEntity> page = this.page(
                new Query<OSysUserEntity>().getPage(params),
                new QueryWrapper<OSysUserEntity>()
        );

        return new PageUtils(page);
    }

}