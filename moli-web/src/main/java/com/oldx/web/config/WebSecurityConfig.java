package com.oldx.web.config;


import com.oldx.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
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

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
       httpSecurity.authorizeRequests()
               .antMatchers(HttpMethod.GET, // 允许对于网站静态资源的无授权访问
                       "/*",
                       "/*.html",
                       "/favicon.ico",
                       "/**/*.html",
                       "/**/*.css",
                       "/**/*.js",
                       "/swagger-resources/**",
                       "/v2/api-docs/**",
                       "/webjars/springfox-swagger-ui/**"
               )
               .permitAll()
               .and()
               .formLogin()
               .loginPage("/login").failureUrl("/error/403");
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



}
