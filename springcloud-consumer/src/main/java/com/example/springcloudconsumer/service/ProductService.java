package com.example.springcloudconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//name 为product项目中application.yml配置文件中的application.name;path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "product-server", path = "")
public interface ProductService {

    @RequestMapping("product/list")
    public String getProduct();
}
