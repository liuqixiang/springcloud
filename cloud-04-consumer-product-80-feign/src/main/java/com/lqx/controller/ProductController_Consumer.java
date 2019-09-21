package com.lqx.controller;

import com.lqx.entity.ProductInfo;
import com.lqx.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liuqixiang
 * @date 2019-08-28 下午8:32
 */
@RestController
public class ProductController_Consumer {
    @Autowired
    private ProductClientService service;

    @RequestMapping(value = "/consumer/product/add")
    public Integer add(ProductInfo product) {
        return service.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public ProductInfo get(@PathVariable("id") Long id) {
        return service.get(id+"");
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<ProductInfo> list() {
        return null;
    }

}
