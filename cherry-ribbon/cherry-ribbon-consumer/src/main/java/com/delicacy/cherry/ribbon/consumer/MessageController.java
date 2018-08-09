package com.delicacy.cherry.ribbon.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author yutao
 * @create 2018-08-06 16:30
 **/
@Slf4j
@RestController
public class MessageController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("sendMessage")
    public String sendMessage(String message,@RequestParam(required = false) Integer timeout) {
        if (timeout!=null){
            countdown(timeout);
        }
        ServiceInstance serviceInstance = loadBalancerClient.choose("cherry-ribbon-provider");
        String forObject = restTemplate.getForObject("http://cherry-ribbon-provider/sendMessage?message="+message, String.class);
        log.info("message={}",forObject);
        return message;
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

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

