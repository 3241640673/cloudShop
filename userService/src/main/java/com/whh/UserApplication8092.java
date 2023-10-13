package com.whh;

import com.whh.client.UserFeign;
import com.whh.feignConfig.MyFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //开启服务发现，注册到注册中心
@EnableFeignClients(clients = UserFeign.class,defaultConfiguration = MyFeignConfig.class)  //开启feign注解
public class UserApplication8092 {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication8092.class,args);
    }

}
