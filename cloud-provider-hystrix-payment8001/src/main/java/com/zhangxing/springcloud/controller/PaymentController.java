package com.zhangxing.springcloud.controller;

import com.zhangxing.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/20 8:48
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String res = paymentService.paymentInfo_OK(id);
        log.info("\nOk result:" + res);
        return res;
    }

    @GetMapping(value = "/payment/hystrix/error/{id}")
    public String paymentInfo_Error(@PathVariable("id") Integer id) {
        String res = paymentService.paymentInfo_Error(id);
        log.info("\nError result:" + res);
        return res;
    }

    //===服务熔断===
    @GetMapping(value = "/payment/hystrix/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String res = paymentService.paymentCircuitBreaker(id);
        log.info("\nError result:" + res);
        return res;
    }
}
