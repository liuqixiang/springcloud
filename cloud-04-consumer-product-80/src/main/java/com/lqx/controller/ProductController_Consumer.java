package com.lqx.controller;

import com.lqx.entity.ProductInfo;
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
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://LQX-PRODUCT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public Integer add(ProductInfo product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Integer.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public ProductInfo get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, ProductInfo.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<ProductInfo> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }

}
