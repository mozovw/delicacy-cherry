package com.delicacy.cherry.eureka.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class MessageServiceImpl implements MessageService{

	@Override
	public String sendMessage(String message) {
		log.info("message={}",message);
		return message;
	}
}
