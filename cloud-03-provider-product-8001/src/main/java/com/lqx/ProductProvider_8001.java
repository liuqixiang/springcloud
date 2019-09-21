package com.lqx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Auther: 梦学谷
 */
//@EnableHystrix
@MapperScan("com.lqx.dao")
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进Eureka中心
public class ProductProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class, args);
    }

}
