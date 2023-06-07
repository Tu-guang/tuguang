package com.tuguang.openapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@MapperScan("com.tuguang.openapi.mapper")
@EnableScheduling
public class TuguangApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuguangApplication.class, args);
    }

}
