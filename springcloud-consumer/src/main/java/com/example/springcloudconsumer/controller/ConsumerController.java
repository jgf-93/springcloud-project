package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getConsumer", produces = "application/json;charset=utf-8")
    public String getConsumer() {
        String str = productService.getProduct();
        return str;
    }
}
