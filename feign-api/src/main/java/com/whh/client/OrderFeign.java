package com.whh.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "orderservice")
public interface OrderFeign {
    @GetMapping("/whh/order/test1")
    String test1();
}
