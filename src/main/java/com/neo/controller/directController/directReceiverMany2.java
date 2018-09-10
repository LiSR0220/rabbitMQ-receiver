package com.neo.controller.directController;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "Lsr_DirectHelloMany")
public class directReceiverMany2 {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("【B用户】:" + msg);
    }
}
