package com.zhangxing.springcloud.test;

import java.time.ZonedDateTime;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/20 19:53
 */
public class T1 {

    public static void main(String[] args) {
        //获取当前时间串
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        //2020-06-17T11:53:40.325+08:00[Asia/Shanghai]
    }

}

