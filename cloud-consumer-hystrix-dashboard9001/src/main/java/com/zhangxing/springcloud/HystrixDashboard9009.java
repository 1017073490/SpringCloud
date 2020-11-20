package com.zhangxing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/20 15:00
 */
@EnableHystrixDashboard //启用Hystrix仪表板
@SpringBootApplication
public class HystrixDashboard9009 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9009.class, args);
    }

}



