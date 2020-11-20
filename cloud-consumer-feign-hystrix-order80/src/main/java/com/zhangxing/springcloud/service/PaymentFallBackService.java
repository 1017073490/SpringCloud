package com.zhangxing.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/20 12:37
 */
@Component
public class PaymentFallBackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "统一降级：-----PaymentFallBackService's paymentInfo_OK-----";
    }

    @Override
    public String paymentInfo_Error(Integer id) {
        return "统一降级：-----PaymentFallBackService's paymentInfo_Error-----";
    }
}
