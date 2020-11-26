package com.zhangxing.springcloud.service.impl;

import com.zhangxing.springcloud.dao.OrderDao;
import com.zhangxing.springcloud.domin.Order;
import com.zhangxing.springcloud.service.AccountService;
import com.zhangxing.springcloud.service.OrderService;
import com.zhangxing.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 10:54
 */
@Service
@Slf4j
public class OderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "zx-global-trans",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("开始新建订单");
        orderDao.create(order);

        log.info("开始调用库存，做扣减操作");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("开始调用库存，做扣减操作完成");

        log.info("开始调用账户，做扣减操作");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("开始调用账户，做扣减操作完成");

        log.info("开始修改订单状态");
        orderDao.update(order.getUserId(), 0);
        log.info("修改订单状态完成");

        log.info("订单完成");


    }
}
