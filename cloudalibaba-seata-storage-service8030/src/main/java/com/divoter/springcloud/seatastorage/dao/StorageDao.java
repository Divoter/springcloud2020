package com.divoter.springcloud.seatastorage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * com.divoter.springcloud.seatastorage.dao
 *
 * @author divoter
 * @date 2021/1/7 19:50
 */
@Mapper
public interface StorageDao {
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
