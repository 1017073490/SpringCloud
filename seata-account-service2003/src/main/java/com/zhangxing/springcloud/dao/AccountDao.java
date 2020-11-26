package com.zhangxing.springcloud.dao;

import com.zhangxing.springcloud.domin.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/26 10:36
 */
@Mapper
public interface AccountDao  {
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
