package com.lamu.service.impl;

import com.lamu.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * 订单处理业务类
 * Created by Administrator on 2016/1/21.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    //模拟阿里订单
    public void doAlipay(String orderData) {
        System.out.println("orderData:" + orderData);
    }
}
