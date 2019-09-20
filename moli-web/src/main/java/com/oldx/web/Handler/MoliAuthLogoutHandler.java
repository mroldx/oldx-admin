package com.oldx.web.Handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 注销处理器
 */
public class MoliAuthLogoutHandler implements LogoutHandler {

    private SessionRegistry sessionRegistry;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        String sessionId = request.getRequestedSessionId();
        if (sessionId != null)
            sessionRegistry.removeSessionInformation(sessionId);
    }

    public SessionRegistry getSessionRegistry() {
        return sessionRegistry;
    }

    public void setSessionRegistry(SessionRegistry sessionRegistry) {
        this.sessionRegistry = sessionRegistry;
    }
}