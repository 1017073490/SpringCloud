package com.zhangxing.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/23 10:19
 */
@RestController
@Slf4j
public class ConsumerController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {

        log.info("consumer with serverPort: " + serverPort + "\t id: " + id);
        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
    }

}
