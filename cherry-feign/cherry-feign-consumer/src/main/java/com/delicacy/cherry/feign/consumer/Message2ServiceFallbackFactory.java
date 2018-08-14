package com.delicacy.cherry.feign.consumer;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Message2ServiceFallbackFactory implements FallbackFactory<Message2Service> {

    @Override
    public Message2Service create(Throwable cause) {
        return new Message2Service() {
            @Override
            public String sendMessage(String message, Integer timeout) {
                return "error";
            }
        };
    }
}