package com.delicacy.cherry.stream.kafka.producer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;

public interface KafkaMessageSource {


    String MESSAGE_OUTPUT = "message_output";

    @Output(MESSAGE_OUTPUT)
    MessageChannel messageOutput();


}
