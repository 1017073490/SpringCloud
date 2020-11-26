package com.zhangxing.springcloud.dao;

import com.zhangxing.springcloud.domin.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 10:36
 */
@Mapper
public interface OrderDao {
    //新建订单
    void create(Order order);

    //修改订单状态，从0->1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
