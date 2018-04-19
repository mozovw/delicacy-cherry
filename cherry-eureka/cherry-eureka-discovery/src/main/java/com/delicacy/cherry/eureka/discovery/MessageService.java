package com.delicacy.cherry.eureka.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@FeignClient("cherry-eureka-discovery")
interface MessageService {

	@RequestMapping(value = "/getMessage",method = RequestMethod.GET)
	String getMessage();

	@RequestMapping(value = "/setMessage",method = RequestMethod.GET)
	String setMessage(String message);
}
