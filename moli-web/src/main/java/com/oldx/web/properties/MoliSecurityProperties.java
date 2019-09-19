package com.oldx.web.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "moli.security")
public class MoliSecurityProperties {
    // 登录 URL
    private String loginUrl;
    // 免认证静态资源路径
    private String anonResourcesUrl;
    // 记住我超时时间
    private int rememberMeTimeout;
    // 登出 URL
    private String logoutUrl;
    // 主页 URL
    private String indexUrl;

}
