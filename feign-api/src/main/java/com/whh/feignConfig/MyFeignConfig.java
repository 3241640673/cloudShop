package com.whh.feignConfig;

import com.whh.client.ClientFeignFallbackFactory;
import feign.Logger;
import org.springframework.context.annotation.Bean;

public class MyFeignConfig {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
    @Bean
    public ClientFeignFallbackFactory clientFeignFallbackFactory(){
        return new ClientFeignFallbackFactory();
    }
}
