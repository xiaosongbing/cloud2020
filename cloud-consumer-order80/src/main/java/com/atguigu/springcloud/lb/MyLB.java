package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import sun.applet.Main;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLB
 * @Description 手写负载均衡算法
 * @Author wangzuzhen
 * @Create 2020-03-31 23:56
 * @Version 1.0
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        }while (!atomicInteger.compareAndSet(current, next));
        System.out.println("***********第几次访问, next : " + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> instances) {
        //当前接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标, 每次重启后rest接口记数从1开始.
        int index = getAndIncrement() % instances.size();
        return instances.get(index);
    }
}
