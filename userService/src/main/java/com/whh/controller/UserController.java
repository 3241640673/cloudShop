package com.whh.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.whh.client.UserFeign;
import com.whh.pojo.User;
import com.whh.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/whh")
@RestController
/*@RefreshScope*/
public class UserController {
    @Autowired
    private UserFeign userFeign;
    @Autowired
    private UserService userService;

    /*  @Value("${pattern.dataformat}")
      private String dateformat;

      @GetMapping("/user/dataNow")
      public String now(){
          return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
      }*/
  /*   @GetMapping("/user/{id}")
     public User findById(@PathVariable Integer id) {
         User user = userService.getById(id);
         return user;

     }*/
    @SentinelResource("hot")
    @GetMapping("/user/test")
    public String test() {
        /*String s = feign.test1();
        System.out.println(s);*/
        System.out.println("cloud...");
        return "test OK";
    }

    /* @GetMapping("/user/test1")
     public String test1() {
         return " test1 OK";
     }
 */
    @GetMapping("/user1/{sub}/{sex}")
    public List<User> test1(@PathVariable String sub, @PathVariable String sex) {
        return userService.fingIf(sub, sex);
    }
}
