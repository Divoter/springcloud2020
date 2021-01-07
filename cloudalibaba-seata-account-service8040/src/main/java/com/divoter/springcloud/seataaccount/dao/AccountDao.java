package com.divoter.springcloud.seataaccount.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * com.divoter.springcloud.seataaccount.dao
 *
 * @author divoter
 * @date 2021/1/7 20:25
 */
@Mapper
public interface AccountDao {

    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
