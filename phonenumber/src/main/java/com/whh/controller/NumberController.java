package com.whh.controller;

import com.whh.service.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequestMapping("/whh")
@RestController
public class NumberController {
    @Autowired
    private CardServiceImpl cardService;
    @GetMapping("/getCode/{tele}")
    public String getCode(@PathVariable String tele){
        return cardService.get(tele);
    }
    @GetMapping("/check/{tele}/{code}")
    public Boolean check(@PathVariable String tele,@PathVariable String code){
        return cardService.check(tele, code);
    }
}
