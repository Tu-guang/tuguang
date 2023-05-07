package com.tuguang.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class TestController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello SpringBoot!";
    }
}
