package com.delicacy.cherry.stream.rabbitmq.consumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MqMessageSource {
    String MESSAGE_INPUT = "message_input";

    @Input(MESSAGE_INPUT)
    MessageChannel messageInput();

}
