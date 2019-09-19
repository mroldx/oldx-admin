package com.oldx.web.config;


import com.oldx.web.Handler.MoliAuthenticationFailHandler;
import com.oldx.web.Handler.MoliAuthenticationSuccessHandler;
import com.oldx.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @www.codesheep.cn 20190312
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;
    @Autowired
    private SecurityProperties securityProperties;
    @Autowired
    private MoliAuthenticationSuccessHandler moliAuthenticationSuccessHandler;
    @Autowired
    private MoliAuthenticationFailHandler moliAuthenticationFailHandler;
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        log.info("开始执行securityConfig");
        httpSecurity.authorizeRequests().antMatchers(
                "/",
                "/*.html",
                "/favicon.ico",
                "/**/*.html",
                "/**/*.css",
                "/**/*.js",
                "/swagger-resources/**",
                "/v2/api-docs/**",
                "/webjars/springfox-swagger-ui/**"
        ).permitAll()
                .and()
                .formLogin()
                .loginPage("/authentication/login")   // 未认证跳转 URL
                .loginProcessingUrl("/authentication/form")
                .successHandler(moliAuthenticationSuccessHandler)
                .failureHandler(moliAuthenticationFailHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/login","/image/code1").permitAll()
                .anyRequest()
                .authenticated()
                .and().csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
