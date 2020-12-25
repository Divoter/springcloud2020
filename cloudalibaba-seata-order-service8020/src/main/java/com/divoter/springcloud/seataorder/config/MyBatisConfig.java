package com.divoter.springcloud.seataorder.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/**
 * com.divoter.springcloud.seataorder.config
 *
 * @author divoter
 * @date 2020/12/24 22:31
 */
@Configuration
@MapperScan({"com.divoter.springcloud.seataorder.dao"})
public class MyBatisConfig {
}
