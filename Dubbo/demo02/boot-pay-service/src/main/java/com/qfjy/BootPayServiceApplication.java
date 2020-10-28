package com.qfjy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootPayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootPayServiceApplication.class, args);
    }

}
