package com.oldx.web.Handler;

import com.oldx.web.properties.MoliSecurityProperties;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.session.InvalidSessionStrategy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理 session 失效
 */
public class FebsInvalidSessionStrategy implements InvalidSessionStrategy {

    private MoliSecurityProperties securityProperties;

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response) throws IOException {
        redirectStrategy.sendRedirect(request, response, securityProperties.getLogoutUrl());
    }

    public MoliSecurityProperties getSecurityProperties() {
        return securityProperties;
    }

    public void setSecurityProperties(MoliSecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }
}
