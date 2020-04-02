package com.atguigu.springcloud.bean;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description
 * @Author wangzuzhen
 * @Create 2020-04-01 22:54
 * @Version 1.0
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        //请求和响应的头信息, 请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
