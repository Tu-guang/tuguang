package com.tuguang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tuguang.mapper")
public class TuguangApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuguangApplication.class, args);
    }

}
