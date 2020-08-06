package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/save")
    public void testSave(){
        for (int i=0;i<100;i++){
            Order order=new Order();
            order.setName("电脑"+i);
            order.setType("办公");
            orderService.save(order);

        }
    }
    @GetMapping("/get")
    public void testGetById(){
        long id = 1291286856171843585L;
        Order order = orderService.getById(id);
        if(order!=null){
            System.out.println(order.toString());
        }else{
            System.out.println("未获取到");
        }

    }
}
