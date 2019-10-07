package com.lqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqixiang
 * @date 2019-10-07 下午6:08
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进Eureka中心
public class OrderPayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderPayServiceApplication.class, args);
    }

}