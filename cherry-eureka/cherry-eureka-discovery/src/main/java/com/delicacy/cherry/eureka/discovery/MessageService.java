package com.delicacy.cherry.eureka.discovery;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cherry-eureka-discovery")
public interface MessageService {

    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
    String sendMessage(@RequestParam("message") String message);
}
