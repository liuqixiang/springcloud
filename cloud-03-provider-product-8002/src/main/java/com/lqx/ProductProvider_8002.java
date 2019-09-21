package com.lqx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqixiang
 * @date 2019-09-21 下午12:22
 */
@MapperScan("com.lqx.dao")
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进Eureka中心
public class ProductProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }
}
