package com.npy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author NNShadow
 * @date 2019/12/1 18:03
 */
@SpringBootApplication
@MapperScan("com.npy.repository")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }
}
