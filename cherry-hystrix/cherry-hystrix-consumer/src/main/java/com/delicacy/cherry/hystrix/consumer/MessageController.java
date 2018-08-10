package com.delicacy.cherry.hystrix.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @GetMapping("sendMessage")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String sendMessage(String message,@RequestParam(required = false) Integer timeout) {
        if (timeout!=null){
            countdown(timeout);
        }
        log.info("message={}",message);
        return message;
    }


    public String fallbackMethod(String message, Integer timeout,Throwable throwable) {
        log.error("message={},timeout={}",message,timeout);
        return "error";
    }

    private void countdown(Integer timeout)  {
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

