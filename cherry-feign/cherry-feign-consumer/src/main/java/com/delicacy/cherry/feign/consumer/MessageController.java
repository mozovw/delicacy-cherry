package com.delicacy.cherry.feign.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author yutao
 * @create 2018-08-06 16:30
 **/
@Slf4j
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("sendMessage")
    public String sendMessage(String message, @RequestParam(required = false) Integer timeout) {
        log.info("message={}", message);
        countdown(timeout);
        return messageService.sendMessage(message, timeout);
    }

    @GetMapping("/sendMessage2")
    public String sendMessage2(String message, @RequestParam(required = false) Integer timeout) {
        log.info("message={}", message);
        countdown(timeout);
        return messageService.sendMessage(message, timeout);
    }

    private void countdown(Integer timeout) {
        if (timeout == null) return;
        //int i = RandomUtils.nextInt(timeout);
        int i = timeout;
        while (i != 0) {
            i--;
            log.warn(String.valueOf(i));
            try {
                TimeUnit.SECONDS.sleep((long) 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

