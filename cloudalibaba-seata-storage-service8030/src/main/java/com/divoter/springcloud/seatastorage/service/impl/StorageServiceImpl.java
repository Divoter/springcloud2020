package com.divoter.springcloud.seatastorage.service.impl;

import com.divoter.springcloud.seatastorage.dao.StorageDao;
import com.divoter.springcloud.seatastorage.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.seatastorage.service.impl
 *
 * @author divoter
 * @date 2021/1/7 19:52
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public int decrease(Long productId, Integer count) {
        return storageDao.decrease(productId, count);
    }
}
