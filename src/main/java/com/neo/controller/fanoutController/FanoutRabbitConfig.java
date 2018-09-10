package com.neo.controller.fanoutController;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FanoutRabbitConfig {

    public static final String fanoutA = "Lsr_fanoutA";
    public static final String fanoutB = "Lsr_fanoutB";
    public static final String fanoutC = "Lsr_fanoutC";

    @Bean
    public Queue AMessage() {
        return new Queue(fanoutA);
    }
    @Bean
    public Queue BMessage() {
        return new Queue(fanoutB);
    }
    @Bean
    public Queue CMessage() {
        return new Queue(fanoutC);
    }
    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("Lsr_fanoutExchange");
    }
    @Bean
    Binding FanoutExchangeA(Queue AMessage, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(AMessage).to(fanoutExchange);
    }
    @Bean
    Binding FanoutExchangeB(Queue BMessage, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(BMessage).to(fanoutExchange);
    }
    @Bean
    Binding FanoutExchangeC(Queue CMessage, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(CMessage).to(fanoutExchange);
    }
}
