package com.example.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;


/**
 * 订单实现层
 * @author jianzh5
 * @date 2019/10/15 17:05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {


}

