# springcloud2020
### SpringCloud学习

### seata搭建过程

> 链接地址 https://github.com/seata/seata-samples/tree/master/springcloud-nacos-seata      
> 注意 启动时的第一部需要用以下代码替换    
>> 此过程需要用到nacos-config.sh  与 config.txt 两个文件，可从以下位置获取   
>> git当前版本工程/script/config-center e.g,https://github.com/seata/seata/tree/1.4.0/script/config-center   
>> 此处用的是nacos
~~~shell script
nacos-config.sh -h localhost -p 8848 -g SEATA_GROUP -t 5a3c7d6c-f497-4d68-a71a-2e5e3340b3ca
~~~
>参数说明：   
-h: host，默认值 localhost   
-p: port，默认值 8848   
-g: 配置分组，默认值为 'SEATA_GROUP'   
-t: 租户信息，对应 Nacos 的命名空间ID字段, 默认值为空 ''   

