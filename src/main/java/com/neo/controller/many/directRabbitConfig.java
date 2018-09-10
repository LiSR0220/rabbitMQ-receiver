package com.neo.controller.many;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *【描述】Direct Exchange是RabbitMQ默认的交换机模式，也是最简单的模式，根据key(binding key)全文匹配去寻找队列。
 * 定义一个 binding key = "directHello"
 * direct 工作模式：当消息中的 路由键 和 这个 binding key 对应上的时候，那么就知道了该消息去到哪一个队列中。
**/
@Configuration
public class directRabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("Lsr_DirectHello");
    }
    @Bean
    public Queue queues(){
            return new Queue("Lsr_DirectHelloMany");
    }
}