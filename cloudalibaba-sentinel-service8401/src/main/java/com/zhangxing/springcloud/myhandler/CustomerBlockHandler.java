package com.zhangxing.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhangxing.springcloud.entity.CommonResult;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/24 16:58
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(404, "按照客户自定义限流测试，Global handlerException ---- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(404, "按照客户自定义限流测试，Global handlerException ---- 2");
    }
}

