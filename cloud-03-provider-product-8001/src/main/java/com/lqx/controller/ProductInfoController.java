package com.lqx.controller;

import com.lqx.entity.ProductInfo;
import com.lqx.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuqixiang
 * @date 2019-08-27 下午11:01
 */
@RestController
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public int add(@RequestBody ProductInfo product) {
        return productInfoService.insertSelective(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public ProductInfo get(@PathVariable("id") String id) {
        return productInfoService.selectByPrimaryKey(id);
    }


}
