package com.times.cloud.uuid.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScans( value = @ComponentScan(basePackages = {"com.times.cloud.common"}) )
public class BackendUuidServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendUuidServiceApplication.class, args);
	}
}
