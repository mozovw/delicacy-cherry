package com.delicacy.cherry.stream.rabbitmq.consumer;

import com.delicacy.cherry.stream.rabbitmq.consumer.message.MqMessageSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.SendTo;

import java.util.Map;

/**
 * MqMessageConsumer
 *
 * @author zyt
 * @create 2018-04-11 18:40
 **/
@EnableBinding({MqMessageSource.class})
public class MqMessageConsumer {

    /*@ServiceActivator(inputChannel=Sink.INPUT)
    public void accept(Map<String, Object> msg){
        System.out.println(msg.get("msg").toString() + ":" + msg.get("username"));
    }*/

    /*@SendTo(MqMessageSource.MESSAGE_OUTPUT)
    @StreamListener(MqMessageSource.MESSAGE_INPUT)
    public String accept(Object msg){
        System.out.println(msg);
        return "sucess";
    }*/

    @StreamListener(MqMessageSource.MESSAGE_INPUT)
    public void accept(Object msg){
        System.out.println(msg);
    }



}
