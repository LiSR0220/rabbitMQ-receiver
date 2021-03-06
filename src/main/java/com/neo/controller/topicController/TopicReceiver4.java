package com.neo.controller.topicController;

import com.neo.controller.many.TopicRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = TopicRabbitConfig.message4)
public class TopicReceiver4 {

    @RabbitHandler
    public void receiver(String s){
        System.out.println("【Lsr_Topic.message2.#.message4】" + s);
    }
}
