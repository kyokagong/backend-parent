package com.times.cloud.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScans( value = @ComponentScan(basePackages = {"com.times.cloud.common", "com.times.cloud.mybatis"}) )
public class BackendUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendUserServiceApplication.class, args);
	}
}
