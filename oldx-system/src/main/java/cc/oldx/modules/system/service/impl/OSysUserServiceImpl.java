package cc.oldx.modules.system.service.impl;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.Query;
import cc.oldx.mbg.domain.OSysUserEntity;
import cc.oldx.mbg.mapper.OSysUserDao;
import cc.oldx.modules.security.utils.JwtTokenUtil;
import cc.oldx.modules.system.dto.OSysUserParam;
import cc.oldx.modules.system.service.OSysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("oSysUserService")
public class OSysUserServiceImpl extends ServiceImpl<OSysUserDao, OSysUserEntity> implements OSysUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OSysUserServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OSysUserEntity> page = this.page(
                new Query<OSysUserEntity>().getPage(params),
                new QueryWrapper<OSysUserEntity>()
        );

        return new PageUtils(page);
    }


    @Override
    public OSysUserEntity getAdminByUsername(String userId) {
        QueryWrapper<OSysUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",userId);

        List<OSysUserEntity> userEntityList = this.baseMapper.selectList(queryWrapper);
        if (userEntityList.size() > 0) {
            return userEntityList.get(0);
        }
        return null;
    }

    @Override
    public OSysUserEntity register(OSysUserParam OSysUserParam) {
        OSysUserEntity user = new OSysUserEntity();
        user.setUsername(OSysUserParam.getUsername());
        user.setStatus("1");
        user.setCreateTime(new Date());
        user.setDescription("");

        QueryWrapper<OSysUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",OSysUserParam.getUsername());

        List<OSysUserEntity> userEntityList = this.baseMapper.selectList(queryWrapper);
        if (userEntityList.size() > 0) {
            return null;
        }

        BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
        String encodePassword = bCrypt.encode(OSysUserParam.getPassword());
        user.setPassword(encodePassword);
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
        return null;
    }

    @Override
    public int updateLoginTime(long id) {
        return 0;
    }

    @Override
    public int updateUserStatus(OSysUserEntity user) {
        return 0;
    }

    @Override
    public int updateUserAvatar(String userName, String avatar) {
        return 0;
    }
}