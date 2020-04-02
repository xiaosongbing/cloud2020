package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description
 * @Author wangzuzhen
 * @Create 2020-03-31 23:55
 * @Version 1.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> instances);
}
