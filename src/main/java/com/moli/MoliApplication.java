package com.moli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.moli.mapper")
@SpringBootApplication
public class MoliApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoliApplication.class,args);
    }
}
