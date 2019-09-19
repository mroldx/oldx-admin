package com.oldx.web;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@EnableSwagger2
public class OldxWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OldxWebApplication.class);
        LoggerFactory.getLogger(OldxWebApplication.class).info(
                "《《《《《《 MOLI started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());


    }
}
