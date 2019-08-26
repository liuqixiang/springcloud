package com.lqx.dao;

import com.lqx.entity.ProductInfo;

public interface ProductInfoMapper {
    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);
}