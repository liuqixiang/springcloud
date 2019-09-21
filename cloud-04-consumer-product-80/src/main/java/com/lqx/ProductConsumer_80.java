package com.lqx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqixiang
 * @date 2019-08-28 下午8:33
 */
@SpringBootApplication
@EnableEurekaClient //标识Eureka客户端
public class ProductConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80.class, args);
    }

}
