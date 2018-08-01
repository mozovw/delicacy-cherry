package com.delicacy.cherry.stream.kafka.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaMessageSource {


    String MESSAGE_INPUT = "message_input";

    @Input(MESSAGE_INPUT)
    SubscribableChannel messageInput();


}
