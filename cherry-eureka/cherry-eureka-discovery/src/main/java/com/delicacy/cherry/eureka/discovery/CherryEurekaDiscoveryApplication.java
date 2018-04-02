package com.delicacy.cherry.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CherryEurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryEurekaDiscoveryApplication.class, args);
	}
}
