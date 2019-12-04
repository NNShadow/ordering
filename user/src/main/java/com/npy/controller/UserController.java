package com.npy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NNShadow
 * @date 2019/12/4 10:44
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "order的端口：" + this.port;
    }
}