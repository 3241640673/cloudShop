package com.whh.config;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public FanoutExchange fanoutExchang(){
        return new FanoutExchange("topic_change");
    }
    @Bean
    public Queue queue1(){
        return new Queue("topic.q1");
    }
    @Bean
    public Queue queue2(){
        return new Queue("topic.q2");
    }
    @Bean
    public Binding binding1(){
        return BindingBuilder.bind(queue1()).to(fanoutExchang());
    }
    @Bean
    public Binding binding2(FanoutExchange fanoutExchange,Queue queue2){
        return BindingBuilder.bind(queue2).to(fanoutExchange);
    }
}
