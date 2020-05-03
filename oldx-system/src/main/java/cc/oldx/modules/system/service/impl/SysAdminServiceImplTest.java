package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.mbg.mapper.OSysUserMapper;
import junit.framework.TestCase;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author: moli
 *
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/5/2 17:45
 */
public class SysAdminServiceImplTest extends TestCase {
    @Resource
    private OSysUserMapper userMapper;
    public void testUpdateLoginTime() {
        Long a=1L;

        OSysUser sysUser = new OSysUser();
       sysUser.setLastLoginTime(new Date());
      sysUser.setUserId(a);
        userMapper.updateByPrimaryKey(sysUser);

    }
}