package com.delicacy.cherry.feign.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author yutao
 * @create 2018-08-06 16:30
 **/
@FeignClient(value = "cherry-feign-provider",fallback = MessageServiceFallback.class)
public interface MessageService {

    @GetMapping("sendMessage")
    String sendMessage(@RequestParam("message") String message, @RequestParam(value = "timeout", required = false) Integer timeout);

}

