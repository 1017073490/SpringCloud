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
@FeignClient(value = "seata-account-service-zx")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(
            @RequestParam("userId") Long userId,
            @RequestParam("money") BigDecimal money);
}
