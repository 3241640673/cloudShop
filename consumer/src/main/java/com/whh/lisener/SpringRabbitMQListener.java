package com.whh.lisener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SpringRabbitMQListener {
    @RabbitListener(queues = "whh.queue")
    public void doMessage(String str){
        System.out.println("取到队列消息："+str);
    }
}
