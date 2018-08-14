package com.delicacy.cherry.feign.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zyt
 * @create 2018-08-14 10:53
 **/
@FeignClient(value = "cherry-feign-provider",fallbackFactory = Message2ServiceFallbackFactory.class)
public interface Message2Service {

    @GetMapping("2/sendMessage")
    String sendMessage(@RequestParam("message") String message, @RequestParam(value = "timeout", required = false) Integer timeout);

}
