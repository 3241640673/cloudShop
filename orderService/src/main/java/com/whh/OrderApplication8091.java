package com.whh;

import com.whh.client.OrderFeign;
import com.whh.feignConfig.MyFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //开启服务发现，注册到注册中心
@EnableFeignClients(clients = OrderFeign.class,defaultConfiguration = MyFeignConfig.class)  //开启feign注解
public class OrderApplication8091 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication8091.class,args);
    }
}
