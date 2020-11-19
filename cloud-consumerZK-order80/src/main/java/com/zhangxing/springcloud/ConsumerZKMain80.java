package com.zhangxing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/19 15:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZKMain80.class, args);
    }
}
