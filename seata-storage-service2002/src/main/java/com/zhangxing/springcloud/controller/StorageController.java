package com.zhangxing.springcloud.controller;

import com.zhangxing.springcloud.domin.CommonResult;
import com.zhangxing.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 13:57
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        System.out.println("进入了seata-storage-service-zx的/storage/decrease");
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功!");
    }

}

