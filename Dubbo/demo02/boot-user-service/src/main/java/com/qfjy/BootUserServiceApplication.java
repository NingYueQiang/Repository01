package com.qfjy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qfjy.mapper"}) //必须精确到mapper文件所在的具体包
@EnableDubbo // 开启扫描Dubbo的@service注解
public class BootUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceApplication.class, args);
    }

}
