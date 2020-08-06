package com.example.demo;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class OrderServiceImplTest extends DemoApplication{
    @Autowired
    private OrderService orderService;

    @Test
    public void testSave(){
        for (int i=0;i<100;i++){
            Order order=new Order();
            order.setName("电脑"+i);
            order.setType("办公");
            orderService.save(order);

        }
    }
    @Test
    public void testGetById(){
        long id = 1184489163202789377L;
        Order order = orderService.getById(id);
        System.out.println(order.toString());
    }
}
