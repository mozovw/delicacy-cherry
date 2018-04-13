package com.delicacy.cherry.stream.rabbitmq.producer;

import com.delicacy.cherry.stream.rabbitmq.producer.message.MqMessageSource;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Map;

/**
 * MqMessageProducer
 *
 * @author zyt
 * @create 2018-04-11 18:37
 **/
@EnableBinding({MqMessageSource.class,Source.class})
@RestController
public class MqMessageProducer {

    @Autowired
    @Output(MqMessageSource.MESSAGE_OUTPUT)
    private MessageChannel msgchannel;

    @Autowired
    @Output(Source.OUTPUT)
    private MessageChannel channel;

    @PostMapping( "/send")
    public void write (@RequestBody Map<String, Object> msg){
        channel.send(MessageBuilder.withPayload(msg).build());
    }

    @PostMapping( "/sendUser")
    public void send(@RequestBody User user){
        msgchannel.send(MessageBuilder.withPayload(user).build());
    }

    @Data
    @Accessors(chain = true)
    static class User implements Serializable {
        private static final long serialVersionUID = 771055052101012653L;
        private String name = "tom";
        private int age = 12;
    }

}
