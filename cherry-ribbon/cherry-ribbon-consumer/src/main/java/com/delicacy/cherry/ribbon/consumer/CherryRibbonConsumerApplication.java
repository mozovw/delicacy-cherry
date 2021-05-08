package com.delicacy.cherry.ribbon.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient("cherry-ribbon-consumer")
public class CherryRibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CherryRibbonConsumerApplication.class, args);
    }

}
