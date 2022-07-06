package com.example.order.Orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class OrdersApi {

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
