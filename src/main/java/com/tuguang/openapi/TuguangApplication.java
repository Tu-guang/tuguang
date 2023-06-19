package com.tuguang.openapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@MapperScan("com.tuguang.openapi.mapper")
@EnableScheduling
@EnableDubbo
public class TuguangApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuguangApplication.class, args);
    }

}
