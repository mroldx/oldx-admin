package com.moli.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.moli.web.dao"})
public class MoliApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoliApplication.class, args);
    }

}
