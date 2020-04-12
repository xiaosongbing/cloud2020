package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9004
 * @Description
 * @Author wangzuzhen
 * @Create 2020-04-12 20:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
    }
}
