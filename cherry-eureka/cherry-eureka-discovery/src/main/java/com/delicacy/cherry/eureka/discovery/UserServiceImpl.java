package com.delicacy.cherry.eureka.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
class UserServiceImpl implements UserService{

//	@Autowired
	@Resource(name = "messageService")
	private MessageServiceImpl messageService;

	@Override
	public String receiveMessage() {
		log.info(Thread.currentThread().getName());
		return messageService.getMessage();
	}

	@Override
	public String sendMessage(String message) {
		log.info(Thread.currentThread().getName());
		return messageService.setMessage(message);
	}
}
