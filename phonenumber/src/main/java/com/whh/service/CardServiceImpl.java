package com.whh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class CardServiceImpl implements ICardService{
    @Autowired
   private  Demo demo;
    @CachePut(value = "whh",key = "#tele")
    public String get(String tele) {
       return Integer.toString(new Random().nextInt(900000) + 100000);
    }
     public Boolean check(String tele, String code) {
         String getcode = demo.getcode(tele);
         return tele.equals(getcode);
    }
}
