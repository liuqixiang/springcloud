package com.lqx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuqixiang
 * @date 2019-08-28 下午8:33
 */
@SpringBootApplication
//会扫描标记了指定包下@FeignClient注解的接口,并生成此接口的代理对象
@EnableFeignClients(basePackages= {"com.lqx.service"})
@EnableEurekaClient //标识Eureka客户端
public class ProductConsumer_80_feign {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_feign.class, args);
    }

}
