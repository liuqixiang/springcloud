package com.lqx.controller;

import com.lqx.entity.ProductInfo;
import com.lqx.service.ProductInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    //当get方法出现异常时,则会调用hystrixGet方法处理
    //@HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public ProductInfo get(@PathVariable("id") String id) {
        System.out.println("8001-----------------");
        ProductInfo productInfo = productInfoService.selectByPrimaryKey(id);
        //模拟异常
        if(productInfo == null) {
            throw new RuntimeException("ID=" + id + "无效");
        }
        return productInfo;
    }
    //当get方法出现异常时,则会调用此方法. 注意此方法的返回值,参数列表与原方法一致
    public ProductInfo getFallback(@PathVariable("id") Long id) {
        return new ProductInfo(id+"",
                 "ID=" + id + "无效--@HystrixCommand");
    }

}
