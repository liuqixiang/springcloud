package com.lqx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: lqx
 */
@Configuration //标识配置类
public class ConfigBean {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
