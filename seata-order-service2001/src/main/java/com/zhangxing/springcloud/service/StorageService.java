package com.zhangxing.springcloud.service;

import com.zhangxing.springcloud.domin.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 10:52
 */
@FeignClient(value = "seata-storage-service-zx")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}


