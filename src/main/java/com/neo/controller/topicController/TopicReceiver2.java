package com.neo.controller.topicController;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *【描述】路由模式接收[Lsr_Topic.#]
 * 只要消息队列的名称是Lsr_Topic字段开头的消息，该接收器都接收。
**/
//@Component
@RabbitListener(queues = "Lsr_Topic.message2")
public class TopicReceiver2 {

    @RabbitHandler
    public void receiver(String s){
        System.out.print("message2");
        System.out.println("【路由消息】***接收所有Lsr_Topic._的消息***：" + s);
    }
}
