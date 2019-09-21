package com.lqx.service;

import com.lqx.entity.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liuqixiang
 * @date 2019-09-21 下午1:22
 */
@FeignClient(value = "LQX-PRODUCT", fallback =
        ProductClientServiceFallBack.class)
public interface ProductClientService {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    int add(@RequestBody ProductInfo product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    ProductInfo get(@PathVariable("id") String id);

}
