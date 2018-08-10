package com.delicacy.cherry.ribbon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient("cherry-ribbon-provider")
public class CherryRibbonProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryRibbonProviderApplication.class, args);
	}
}
