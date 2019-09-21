package com.lqx.service;

import com.lqx.entity.ProductInfo;

/**
 * @author liuqixiang
 * @date 2019-08-27 下午10:56
 */
public interface ProductInfoService {

    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);


}
