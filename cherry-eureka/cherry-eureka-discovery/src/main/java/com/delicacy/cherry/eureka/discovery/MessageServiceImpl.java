package com.delicacy.cherry.eureka.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("MessageService")
class MessageServiceImpl implements MessageService{

    private static ThreadLocal<String> message = new ThreadLocal<>();

	@Override
	public String setMessage(String message) {
		log.info(Thread.currentThread().getName());
		this.message.set(message);
		return message;
	}


}
