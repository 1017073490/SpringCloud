package com.zhangxing.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/21 19:03
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")    //spring的@Value注解
    private String configInfo;

    @Value("${server.port")    //spring的@Value注解
    private String serverPort;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort:" + serverPort + "\nconfigInfo:" + configInfo;
    }

}
