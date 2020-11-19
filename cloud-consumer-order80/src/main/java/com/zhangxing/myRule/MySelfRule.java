package com.zhangxing.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/19 20:54
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        System.out.println("随即设置");
        return new RandomRule();    //负载均衡机制改为随机
    }

}

