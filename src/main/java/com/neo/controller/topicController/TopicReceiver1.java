package com.neo.controller.topicController;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *【描述】只接收 [message1 = "Lsr_Topic.message1"]的消息！
**/
@Component
@RabbitListener(queues = "Lsr_Topic.message1")
public class TopicReceiver1 {

    @RabbitHandler
    public void onlyOne(String msg){
        System.out.print("message1");
        System.out.println("【路由消息】***只接收message1***：" + msg);
    }
}
