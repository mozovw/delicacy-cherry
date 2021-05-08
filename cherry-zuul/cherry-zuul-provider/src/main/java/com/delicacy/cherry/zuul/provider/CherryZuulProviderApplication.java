package com.delicacy.cherry.zuul.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 实现限流 https://yq.aliyun.com/articles/707059
 */
@SpringBootApplication
@EnableZuulProxy
public class CherryZuulProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryZuulProviderApplication.class, args);
	}
}
