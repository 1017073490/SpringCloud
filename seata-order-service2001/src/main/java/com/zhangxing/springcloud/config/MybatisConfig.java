package com.zhangxing.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 12:23
 */
@MapperScan("com.zhangxing.springcloud.dao")
@Configuration
public class MybatisConfig {
}
