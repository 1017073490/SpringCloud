package com.zhangxing.springcloud.service;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 13:55
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}

