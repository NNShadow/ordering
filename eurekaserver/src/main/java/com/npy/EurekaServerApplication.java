package com.npy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author NNShadow
 * @date 2019/11/21 17:01
 */
//声明该类是 Spring Boot 服务入口
@SpringBootApplication
//声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能（注册中心）
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
