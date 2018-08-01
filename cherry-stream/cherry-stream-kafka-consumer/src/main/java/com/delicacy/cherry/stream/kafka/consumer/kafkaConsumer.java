package com.delicacy.cherry.stream.kafka.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * kafka消费者
 *
 * @author yutao
 * @create 2018-07-26 10:10
 **/
@Component
@EnableBinding(KafkaMessageSource.class)
public class kafkaConsumer {


    @StreamListener(KafkaMessageSource.MESSAGE_INPUT)
    public void process(String message) {
        System.out.println(message);
    }


}
