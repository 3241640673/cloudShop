package com.whh.controller;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.whh.client.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RequestMapping("/whh")
@RestController
/*@RefreshScope*/
public class OrderController {
/*    @Autowired
    public OrderFeign orderFeign;*/
   /* private Properties properties;*/
   /* @Value("${pattern.dateformat}")
    private String dataformat;*/
    /*
    @GetMapping("/dataNow")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }*/
   /* @GetMapping("/order/dataNow")*/
   /* public Properties nowShare(){*/
   /*     return properties;*/
   /* }*/
   /* @GetMapping("/order/{id}")*/
   /* public User findById(@PathVariable Integer id){*/
   /*     return feign.getUser(id);*/
   /* }*/
 /**/   /*@SentinelResource("hot")*/
    @GetMapping("/order/test")
    public String  test(@RequestHeader(value = "token",required = false) String token){

        System.out.println("token:"+token);
        if("admin".equals(token)){
            System.out.println("认证通过");
        }else {
            System.out.println("认证失败");
        }
        System.out.println("springCloud is running...");
        return "OK";
    }

    @GetMapping("/w")
    public String test1() {
        return " 好笨啊！";
    }

}