package com.lqx.service;

import com.lqx.entity.ProductInfo;
import org.springframework.stereotype.Component;

/**
 * @author liuqixiang
 * @date 2019-09-21 下午7:38
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService{
    @Override
    public int add(ProductInfo product) {
        return 0;
    }

    @Override
    public ProductInfo get(String id) {
        return new ProductInfo(id, "id="+ id + "无数据--feign&hystrix");
    }
}
