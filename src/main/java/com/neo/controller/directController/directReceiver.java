package com.neo.controller.directController;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *【描述】dircet 模式接受器
**/
@Component
@RabbitListener(queues = "Lsr_DirectHello")
public class directReceiver {

    @RabbitHandler
    public void receiver(String msg) {
        System.out.println("【direct模式】接收信息:" + msg);
    }
}
