package com.zhangxing.springcloud.controller;

import com.zhangxing.springcloud.entity.CommonResult;
import com.zhangxing.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/25 9:39
 */
@RestController
public class PaymentController {

    @Value("${server.port}")    //spring的注解
    private String serverPort;

    public static HashMap<Long, Payment> map = new HashMap<>();

    static {
        map.put(1L, new Payment(1L, "1111"));
        map.put(2L, new Payment(2L, "2222"));
        map.put(3L, new Payment(3L, "3333"));
    }


    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        System.out.println("进入了提供者9004");
        Payment payment = map.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "from serverPort: " + serverPort, payment);
        return result;
    }
}

