package com.delicacy.cherry.stream.rabbitmq.producer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MqMessageSource {
    String MESSAGE_OUTPUT = "message_output";

    @Output(MESSAGE_OUTPUT)
    MessageChannel messageOutput();

}
