package com.example.springcloudproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient只适用于Eureka作为注册中心，而@EnableDiscoveryClient可以是其他注册中心；
@EnableDiscoveryClient
//表示开启Feign客户端
@EnableFeignClients
public class SpringcloudProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProductApplication.class, args);
    }

}
