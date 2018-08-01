package com.delicacy.cherry.stream.kafka.producer;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * kafka消费者
 *
 * @author yutao
 * @create 2018-07-26 10:10
 **/
@RestController
@EnableBinding(KafkaMessageSource.class)
public class KafkaProducer {


    @Autowired
    @Output(KafkaMessageSource.MESSAGE_OUTPUT)
    private MessageChannel msgchannel;

    @GetMapping( "/send")
    public void send(){
        msgchannel.send(MessageBuilder.withPayload("aaaaaa").build());
    }

    @Data
    @Accessors(chain = true)
    static class User implements Serializable {
        private static final long serialVersionUID = 771055052101012653L;
        private String name = "tom";
        private int age = 12;
    }


}
