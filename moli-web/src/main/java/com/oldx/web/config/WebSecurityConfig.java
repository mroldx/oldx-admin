package com.oldx.web.config;


import com.oldx.web.Handler.*;
import com.oldx.web.img.ImageCodeFilter;
import com.oldx.web.properties.MoliSecurityProperties;
import com.oldx.web.service.ImgCodeService;
import com.oldx.web.service.MoLiUserDetailsService;
import com.oldx.web.service.impl.ImageCodeServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.session.InvalidSessionStrategy;

/**
 * @www.codesheep.cn 20190312
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MoliSecurityProperties moliSecurityProperties;
    @Autowired
    private MoLiUserDetailsService moLiUserDetailsService;
    @Autowired
    private MoliAuthenticationSuccessHandler moliAuthenticationSuccessHandler;
    @Autowired
    private MoliAuthenticationFailHandler moliAuthenticationFailHandler;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {

        String[] anonResourcesUrl = StringUtils.splitByWholeSeparatorPreserveAllTokens(moliSecurityProperties.getAnonResourcesUrl(), ",");

        ImageCodeFilter imageCodeFilter = new ImageCodeFilter();
        imageCodeFilter.setAuthenticationFailureHandler(moliAuthenticationFailHandler);
        imageCodeFilter.setSecurityProperties(moliSecurityProperties);
        imageCodeFilter.afterPropertiesSet();

        log.info("开始执行securityConfig");
        httpSecurity.exceptionHandling().accessDeniedHandler(accessDeniedHandler()).
                and()
                /*.addFilterBefore(imageCodeFilter, UsernamePasswordAuthenticationFilter.class) // 添加图形证码校验过滤器*/
                .formLogin()
                .loginPage(moliSecurityProperties.getLoginUrl())   // 未认证跳转 URL
                .loginProcessingUrl("/authentication/form")
                .successHandler(moliAuthenticationSuccessHandler)
                .failureHandler(moliAuthenticationFailHandler)
                .and()
                .sessionManagement() // 配置 session管理器
                .invalidSessionStrategy(invalidSessionStrategy()) // 处理 session失效
                .maximumSessions(moliSecurityProperties.getSession().getMaximumSessions()) // 最大并发登录数量
                .expiredSessionStrategy(new FebsExpiredSessionStrategy()) // 处理并发登录被踢出
                .sessionRegistry(sessionRegistry()) // 配置 session注册中心
                .and()
                .and()
                .logout()//登出处理
                .addLogoutHandler(logoutHandler())
                .logoutUrl(moliSecurityProperties.getLogoutUrl())
                .logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID")
                .and()
                .userDetailsService(moLiUserDetailsService)//处理用户逻辑
                .authorizeRequests()
                .antMatchers(anonResourcesUrl).permitAll()
                .antMatchers(
                        moliSecurityProperties.getLoginUrl(),
                        moliSecurityProperties.getCode().getImage().getCreateUrl(),
                        "/image/code1").permitAll()
                .anyRequest()
                .authenticated()
                .and().csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 配置登出处理器
    @Bean
    public LogoutHandler logoutHandler() {
        MoliAuthLogoutHandler logoutHandler = new MoliAuthLogoutHandler();
        logoutHandler.setSessionRegistry(sessionRegistry());
        return logoutHandler;
    }

    //权限不足处理器
    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new MoliAuthenticationAccessDeniedHandler();
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

    @Bean
    public InvalidSessionStrategy invalidSessionStrategy() {
        FebsInvalidSessionStrategy febsInvalidSessionStrategy = new FebsInvalidSessionStrategy();
        febsInvalidSessionStrategy.setSecurityProperties(moliSecurityProperties);
        return febsInvalidSessionStrategy;
    }

    @Bean
    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    public ImgCodeService imageCodeGenerator() {
        ImageCodeServiceImpl imageCodeGenerator = new ImageCodeServiceImpl();
        imageCodeGenerator.setSecurityProperties(moliSecurityProperties);
        return imageCodeGenerator;
    }
}
