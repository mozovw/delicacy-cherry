package com.delicacy.cherry.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.delicacy")
@EnableCircuitBreaker
public class CherryFeignConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryFeignConsumerApplication.class, args);
	}
}
