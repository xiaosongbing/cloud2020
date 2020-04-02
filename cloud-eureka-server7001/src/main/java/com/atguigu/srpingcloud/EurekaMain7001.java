package com.atguigu.srpingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaMain7001
 * @Description
 * @Author wangzuzhen
 * @Create 2020-03-28 18:02
 * @Version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7001
{
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}