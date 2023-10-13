package com.whh.client;

import com.whh.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice")
public interface UserFeign {
    @GetMapping("/whh/user/{id}")
    User getUser(@PathVariable("id") Integer id);
    @GetMapping("/whh/user/test1")
    String test1();
}
