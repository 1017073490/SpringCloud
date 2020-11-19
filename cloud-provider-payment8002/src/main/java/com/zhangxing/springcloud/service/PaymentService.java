package com.zhangxing.springcloud.service;

import com.zhangxing.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/18 19:40
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
