package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain80
 * @Description
 * @Author wangzuzhen
 * @Create 2020-03-28 21:01
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
//自定义轮询规则
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
