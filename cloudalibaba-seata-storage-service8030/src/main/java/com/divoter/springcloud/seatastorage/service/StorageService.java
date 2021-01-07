package com.divoter.springcloud.seatastorage.service;

/**
 * com.divoter.springcloud.seatastorage.service
 *
 * @author divoter
 * @date 2021/1/7 19:52
 */
public interface StorageService {
    int decrease(Long productId, Integer count);
}
