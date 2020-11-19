package com.zhangxing.springcloud.service.impl;

import com.zhangxing.springcloud.dao.PaymentDao;
import com.zhangxing.springcloud.entity.Payment;
import com.zhangxing.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/18 19:41
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
