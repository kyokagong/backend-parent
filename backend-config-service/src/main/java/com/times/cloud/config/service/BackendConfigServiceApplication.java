package com.times.cloud.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class BackendConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendConfigServiceApplication.class, args);
	}
}
