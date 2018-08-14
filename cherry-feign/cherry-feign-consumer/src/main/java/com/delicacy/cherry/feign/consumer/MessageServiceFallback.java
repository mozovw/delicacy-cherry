package com.delicacy.cherry.feign.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageServiceFallback implements MessageService {

    @Override
    public String sendMessage(String message, Integer timeout) {
        log.error("error");
        return "error";
    }
}