package com.zhangxing.springcloud.service;

import com.zhangxing.springcloud.entity.CommonResult;
import com.zhangxing.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/25 10:40
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}

