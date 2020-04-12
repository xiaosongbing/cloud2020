package com.atguigui.springcloud.alibaba.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @version 1.0
 * @ClassName: CustomerBlockHandler
 * @Description: TODO
 * @Author jiguangpao
 * @Date: 2020/4/10 10:49
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception)  {
        return  new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception)  {
        return  new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
