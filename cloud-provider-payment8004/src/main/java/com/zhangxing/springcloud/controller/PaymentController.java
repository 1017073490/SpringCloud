package com.zhangxing.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/19 14:02
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentForZookeeper() {
        return "SpringCloud with Zookeeper：" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
