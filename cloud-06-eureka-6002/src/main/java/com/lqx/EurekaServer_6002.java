package com.lqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liuqixiang
 * @date 2019-09-21 上午10:57
 */
@EnableEurekaServer //标识一个Eureka Server服务注册中心
@SpringBootApplication
public class EurekaServer_6002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6002.class,args);
    }
}
