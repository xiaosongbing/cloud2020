package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderZkController
 * @Description
 * @Author wangzuzhen
 * @Create 2020-03-30 22:25
 * @Version 1.0
 */
@RestController
public class OrderConsulController {
    private final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        return  restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }

}
