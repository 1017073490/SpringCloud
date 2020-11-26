package com.zhangxing.springcloud.controller;

import com.zhangxing.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/22 11:20
 */
@RestController
@Slf4j
public class SendMessageController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/stream/sendMessage")
    public String sendMessage(){
        log.info(serverPort);
        return iMessageProvider.send();
    }
}
