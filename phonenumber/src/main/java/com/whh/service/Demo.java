package com.whh.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Cacheable(value = "whh",key = "#tele")
    public  String getcode(String tele){
        return null;
    }
}
