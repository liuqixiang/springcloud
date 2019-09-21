package com.lqx.service.impl;

import com.lqx.dao.ProductInfoMapper;
import com.lqx.entity.ProductInfo;
import com.lqx.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuqixiang
 * @date 2019-08-27 下午10:57
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public int deleteByPrimaryKey(String productId) {
        return 0;
    }

    @Override
    public int insert(ProductInfo record) {
        return productInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductInfo record) {
        return productInfoMapper.insertSelective(record);
    }

    @Override
    public ProductInfo selectByPrimaryKey(String productId) {
        return productInfoMapper.selectByPrimaryKey(productId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProductInfo record) {
        return 0;
    }
}
