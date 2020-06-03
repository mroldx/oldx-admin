package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.mbg.domain.OSysUserExample;
import cc.oldx.mbg.mapper.OSysUserMapper;
import cc.oldx.modules.security.utils.JwtTokenUtil;
import cc.oldx.modules.system.dto.OSysUserParam;
import cc.oldx.modules.system.dto.UserAdminParam;
import cc.oldx.modules.system.service.SysAdminService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 15:55
 */
@Service("sysAdminService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class SysAdminServiceImpl implements SysAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SysAdminServiceImpl.class);
    @Autowired
    private OSysUserMapper userMapper;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public OSysUser getAdminByUsername(String username) {
        OSysUserExample userExample = new OSysUserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<OSysUser> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public OSysUser register(OSysUserParam OSysUserParam) {
        OSysUser user = new OSysUser();
        user.setUsername(OSysUserParam.getUsername());
        user.setStatus("1");
        user.setCreateTime(new Date());
        user.setDescription("");
        OSysUserExample userExample = new OSysUserExample();
        userExample.createCriteria().andUsernameEqualTo(OSysUserParam.getUsername());
        List<OSysUser> userList = userMapper.selectByExample(userExample);
        if (userList.size() > 0) {
            return null;
        }
        BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
        String encodePassword = bCrypt.encode(OSysUserParam.getPassword());
        user.setPassword(encodePassword);
        userMapper.insert(user);
        return user;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("用户名或密码不对");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            //生成token
            token = jwtTokenUtil.generateToken(userDetails);

        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public String refreshToken(String oldToken) {
        String token = oldToken.substring(tokenHead.length());
        if (jwtTokenUtil.canRefresh(token)) {
            return jwtTokenUtil.refreshToken(token);
        }
        return null;
    }

    @Override
    public OSysUser getUserInfo(Long id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OSysUser> list(String name, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        OSysUserExample example = new OSysUserExample();
        OSysUserExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(name)) {
            criteria.andUsernameLike("%" + name + "%");
        }
        return userMapper.selectByExample(example);
    }

    @Override
    public int update(Long id, UserAdminParam admin) {
        OSysUser o = new OSysUser();
        BeanUtils.copyProperties(admin, o);
        o.setUserId(id);
        return userMapper.updateByPrimaryKeySelective(o);
    }

    @Override
    public int delete(Long id) {

        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateLoginTime(long id) {
        OSysUser sysUser = new OSysUser();
        sysUser.setLastLoginTime(new Date());
        OSysUserExample oSysUserExample = new OSysUserExample();
        oSysUserExample.createCriteria().andUserIdEqualTo(id);
        return userMapper.updateByExampleSelective(sysUser, oSysUserExample);
    }

    @Override
    public int updateUserStatus(OSysUser user) {
        OSysUserExample oSysUserExample = new OSysUserExample();
        oSysUserExample.createCriteria().andUserIdEqualTo(user.getUserId());
        return userMapper.updateByExampleSelective(user, oSysUserExample);
    }

    @Override
    public int updateUserAvatar(String userName, String avatar) {
        OSysUser oSysUser = new OSysUser();
        oSysUser.setAvatar(avatar);
        OSysUserExample oSysUserExample = new OSysUserExample();
        oSysUserExample.createCriteria().andUsernameEqualTo(userName);
        return userMapper.updateByExampleSelective(oSysUser, oSysUserExample);
    }

    @Override
    public int deleteUserByIds(Long[] userIds) {
//        OSysUserExample oSysUserExample = new OSysUserExample();
//        oSysUserExample.createCriteria().andUserIdIn(Arrays.asList(userIds));
    //    return userMapper.deleteByExample(oSysUserExample);
        return userMapper.deleteUserByIds(userIds);
    }

    @Override
    public String importUser(List<OSysUser> userList, Boolean isUpdateSupport, String operName) {
        return null;
    }

    @Override
    public boolean resetPassword(String username, String oldpassword, String newpassword, String confirmpassword) {
        return false;
    }

    @Override
    public boolean changePassword(OSysUser oSysUser) {

        BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
        String encodePassword = bCrypt.encode(oSysUser.getPassword());

        oSysUser.setPassword(encodePassword);
        int i = userMapper.updateByPrimaryKey(oSysUser);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void getAdminMenuList() {

    }
}
