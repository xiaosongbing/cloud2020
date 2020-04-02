package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PayMentMain8002
 * @Description
 * @Author wangzuzhen
 * @Create 2020-03-28 21:57
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8002.class, args);
    }
}
