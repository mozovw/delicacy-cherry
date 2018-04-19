package com.delicacy.cherry.eureka.discovery;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cherry-eureka-discovery")
interface UserService {

	@RequestMapping(value = "/receiveMessage",method = RequestMethod.GET)
	String receiveMessage();

	@RequestMapping(value = "/sendMessage",method = RequestMethod.GET)
	String sendMessage(@RequestParam String message);
}