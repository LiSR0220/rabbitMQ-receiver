package com.neo.controller.many;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class TopicRabbitConfig {
    public final static String message1 = "Lsr_Topic.message1";
    public final static String message2 = "Lsr_Topic.message2";
    public final static String message3 = "Lsr_Topic.message2.*";
    public final static String message4 = "Lsr_Topic.message2.#.message4";
    public final static String message5 = "Lsr_Topic.message2.*.message4";
    public final static String message6 = "Lsr_Topic.message2.#";

    @Bean
    public Queue queueMessage1() {
        return new Queue(TopicRabbitConfig.message1);//定义消息队列
    }
    @Bean
    public Queue queueMessage2() {
        return new Queue(TopicRabbitConfig.message2);//定义消息队列
    }
    @Bean
    public Queue queueMessage3() {
        return new Queue(TopicRabbitConfig.message3);//定义消息队列
    }
    @Bean
    public Queue queueMessage4() {
        return new Queue(TopicRabbitConfig.message4);//定义消息队列
    }
    @Bean
    public Queue queueMessage5() {
        return new Queue(TopicRabbitConfig.message5);//定义消息队列
    }
    @Bean
    public Queue queueMessage6() {
        return new Queue(TopicRabbitConfig.message6);//定义消息队列
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("Lsr_TopicExchange",true,false);//交换机
    }

    @Bean
    Binding bindingExchange(Queue queueMessage1, TopicExchange exchange){
        return BindingBuilder.bind(queueMessage1).to(exchange).with("Lsr_Topic.message1");
    }
    @Bean
    Binding bindingS(Queue queueMessage2, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage2).to(exchange).with("Lsr_Topic.#");
    }
}
