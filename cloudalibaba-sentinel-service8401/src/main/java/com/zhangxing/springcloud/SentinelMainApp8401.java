package com.zhangxing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/24 9:29
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelMainApp8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelMainApp8401.class, args);
    }
}
