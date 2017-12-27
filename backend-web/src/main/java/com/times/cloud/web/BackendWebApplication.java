package com.times.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScans( value = @ComponentScan(basePackages = {"com.times.cloud.common", "com.times.cloud.mybatis"}) )
public class BackendWebApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
	    return application.sources(BackendWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendWebApplication.class, args);
	}
}
