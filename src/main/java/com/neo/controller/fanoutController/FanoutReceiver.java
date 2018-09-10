package com.neo.controller.fanoutController;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutReceiver {

    @RabbitHandler
    @RabbitListener(queues = FanoutRabbitConfig.fanoutA)
    public void receiverA(String msg){ System.out.println("fanout 用户 A: " + msg); }

    @RabbitHandler
    @RabbitListener(queues = FanoutRabbitConfig.fanoutB)
    public void receiverB(String msg){ System.out.println("fanout 用户 B: " + msg); }

    @RabbitHandler
    @RabbitListener(queues = FanoutRabbitConfig.fanoutC)
    public void receiverC(String msg){ System.out.println("fanout 用户 C: " + msg); }
}
