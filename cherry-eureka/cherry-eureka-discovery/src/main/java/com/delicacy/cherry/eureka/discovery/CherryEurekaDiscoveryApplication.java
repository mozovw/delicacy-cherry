package com.delicacy.cherry.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.delicacy")
public class CherryEurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryEurekaDiscoveryApplication.class, args);
	}
}
