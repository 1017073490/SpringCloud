package com.zhangxing.springcloud.controller;

import com.zhangxing.springcloud.entity.CommonResult;
import com.zhangxing.springcloud.entity.Payment;
import com.zhangxing.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/18 19:47
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/get/filter")
    public String testFilter() {
        return serverPort;
    }

    @GetMapping(value = "/payment/get/easy/{id}")
    public String getEasy(@PathVariable("id") Long id) {
        return "测试网关：8002" + serverPort + "\t" + id;
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*******插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(404, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("\n*******查询结果：" + result);
        if (result != null) {
            return new CommonResult(200, "查询成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(404, "查询失败，没有相关记录" + id, null);
        }
    }
}
