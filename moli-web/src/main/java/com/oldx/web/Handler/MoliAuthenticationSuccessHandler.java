package com.oldx.web.Handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oldx.common.api.CommonResult;
import com.oldx.common.domain.LoginType;
import com.oldx.common.domain.MoliConstant;
import com.oldx.web.bo.MoLiUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录成功处理类
 */
@Component
public class MoliAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private ObjectMapper mapper = new ObjectMapper();


    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
            throws IOException, ServletException {
        log.info("登录成功了你牛逼a");
        WebAuthenticationDetails details = (WebAuthenticationDetails) authentication.getDetails();
        String remoteAddress = details.getRemoteAddress();
        LoginType loginType = LoginType.normal;
        Object principal = authentication.getPrincipal();
        if (principal instanceof MoLiUserDetails) {
            MoLiUserDetails userDetails = (MoLiUserDetails) principal;
            userDetails.setRemoteAddress(remoteAddress);
            loginType = userDetails.getLoginType();
        }
        response.setContentType(MoliConstant.JSON_UTF8);
        response.getWriter().write(mapper.writeValueAsString(CommonResult.success(details,"成功")));

    }
}
