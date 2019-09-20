package com.oldx.web.controller;


import com.oldx.common.domain.MoliConstant;
import com.oldx.web.img.ImageCode;
import com.oldx.web.service.ImgCodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
public class ValidateCodeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Autowired
    private ImgCodeService imgCodeService;




    @GetMapping("/image/code")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageCode imageCode = (ImageCode) imgCodeService.createCode();
        BufferedImage image = imageCode.getImage();
        imageCode.setImage(null);
        sessionStrategy.setAttribute(new ServletWebRequest(request), MoliConstant.SESSION_KEY_IMAGE_CODE, imageCode);
        response.setContentType("image/jpeg");
        ImageIO.write(image, "jpeg", response.getOutputStream());
    }

}
