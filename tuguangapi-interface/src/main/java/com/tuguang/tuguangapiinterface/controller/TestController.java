package com.tuguang.tuguangapiinterface.controller;

import com.tuguang.tuguangapiclientsdk.model.Params;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/post")
    public String getByPost(@RequestBody Params params, HttpServletRequest request) {
        return "你提交的参数是 " + params.getParams();
    }
}
