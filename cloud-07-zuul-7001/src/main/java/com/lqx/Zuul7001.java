package com.lqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author liuqixiang
 * @date 2019-09-21 下午8:17
 */
@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class Zuul7001 {

    public static void main(String[] args) {
        SpringApplication.run(Zuul7001.class,args);
    }
}
