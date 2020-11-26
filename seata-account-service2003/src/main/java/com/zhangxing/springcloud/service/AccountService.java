package com.zhangxing.springcloud.service;

import com.zhangxing.springcloud.domin.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 10:52
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}

