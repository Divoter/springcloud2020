package com.divoter.springcloud.configclient.controller;

import com.divoter.springcloud.configclient.model.ConfigModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/api/configclient")
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private ConfigModel configModel;

    @GetMapping
    public String getMessage(){
        if (log.isInfoEnabled()) {
            log.info("nacos 配置中心数据:[config.info:{}, version: {}",configModel.getConfigInfo(),configModel.getVersion());
        }
        return "nacos 配置中心数据:[config.info: "+configModel.getConfigInfo()+", version: "+configModel.getVersion()+"]";
    }

}
