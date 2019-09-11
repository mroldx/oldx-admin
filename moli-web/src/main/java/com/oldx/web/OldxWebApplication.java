package com.oldx.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.oldx.mbg.*","com.oldx.web.controller"})
public class OldxWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(OldxWebApplication.class);
    }
}
