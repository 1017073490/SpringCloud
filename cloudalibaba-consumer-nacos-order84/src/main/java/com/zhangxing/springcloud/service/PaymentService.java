package com.zhangxing.springcloud.service;

import com.zhangxing.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import com.zhangxing.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/25 10:31
 */
@FeignClient(value = "nacos-payment-provider-zx",
        fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
