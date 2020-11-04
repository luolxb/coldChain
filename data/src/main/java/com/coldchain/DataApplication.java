package com.coldchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.coldchain.service")
@ComponentScan(basePackages = {"com.common","com.coldchain"})
public class DataApplication {
	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}
}
