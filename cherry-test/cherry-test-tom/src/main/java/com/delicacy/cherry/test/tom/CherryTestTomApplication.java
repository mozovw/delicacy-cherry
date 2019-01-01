package com.delicacy.cherry.test.tom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.delicacy")
public class CherryTestTomApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryTestTomApplication.class, args);
	}


	@Bean
	public SimpleClientHttpRequestFactory httpClientFactory() {
		SimpleClientHttpRequestFactory httpRequestFactory = new SimpleClientHttpRequestFactory();
		httpRequestFactory.setReadTimeout(6000);
		httpRequestFactory.setConnectTimeout(2000);
		return httpRequestFactory;
	}

	@Bean
	public RestTemplate restTemplate(SimpleClientHttpRequestFactory httpClientFactory) {
		RestTemplate restTemplate = new RestTemplate(httpClientFactory);
		return restTemplate;
	}
}
