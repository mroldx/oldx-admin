package com.oldx.web.Handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oldx.common.api.CommonResult;
import com.oldx.common.domain.MoliConstant;
import com.oldx.common.utils.MoliUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 权限不足拦截器
 */
public class MoliAuthenticationAccessDeniedHandler implements AccessDeniedHandler {
    private ObjectMapper mapper = new ObjectMapper();

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException {

        if (MoliUtils.isAjaxRequest(request)) {
            response.setContentType(MoliConstant.JSON_UTF8);
            response.getWriter().write(this.mapper.writeValueAsString(CommonResult.failed("权限不足小伙！")));
        } else {
            redirectStrategy.sendRedirect(request, response, MoliConstant.MoLi_ACCESS_DENY_URL);
        }
    }
}
