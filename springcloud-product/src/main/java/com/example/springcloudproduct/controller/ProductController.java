package com.example.springcloudproduct.controller;

import com.springcloud.entity.Product;
import com.springcloud.entity.entity.Res;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @RequestMapping(value = "list",produces = "application/json;charset=utf-8")
    public Res getProductList(){
        List<Product> productList=new ArrayList();
        for(int i=0;i<10;i++){
            Product product=new Product();
            product.setProductName("产品名称"+i);
            product.setSkuId(Long.valueOf(i));
            product.setSkuName("sku名称:"+i);
            productList.add(product);
        }
        return Res.success(productList);
    }
}
