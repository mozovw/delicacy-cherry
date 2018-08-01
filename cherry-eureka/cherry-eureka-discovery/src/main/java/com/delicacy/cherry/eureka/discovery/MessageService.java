package com.delicacy.cherry.eureka.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(value = "cherry-eureka-discovery",fallback = MessageServiceImpl.class)
interface MessageService {

	@RequestMapping(value = "/setMessage",method = RequestMethod.GET)
	String setMessage(@RequestParam("message")  String message);
}
