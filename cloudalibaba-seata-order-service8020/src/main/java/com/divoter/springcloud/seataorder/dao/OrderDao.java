package com.divoter.springcloud.seataorder.dao;

import com.divoter.springcloud.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * com.divoter.springcloud.seataorder.dao
 *
 * @author divoter
 * @date 2020/12/24 22:01
 */
@Mapper
public interface OrderDao {

    int create(Order order);

    int update(@Param("userId") Long userId, @Param("status") Integer status);
}
