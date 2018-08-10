package com.delicacy.cherry.hystrix.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class CherryHystrixConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryHystrixConsumerApplication.class, args);
	}
}
