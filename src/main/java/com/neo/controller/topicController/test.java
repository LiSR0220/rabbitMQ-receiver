package com.neo.controller.topicController;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.stereotype.Component;

@Component
@RabbitListeners(value = { @RabbitListener(queues = "Lsr_Topic.message1"), @RabbitListener(queues = "Lsr_Topic.message2")})
public class test {

    @RabbitHandler
    @RabbitListener(queues = "Lsr_Topic.message1")
    public void onlyOne(String msg){
        System.out.print("test1");
        System.out.println("【路由消息test】***只接收message1-test***：" + msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "Lsr_Topic.message2")
    public void onlyOne1(String msg){
        System.out.print("test2");
        System.out.println("【路由消息test】***只接收message1-test***：" + msg);
    }
}
