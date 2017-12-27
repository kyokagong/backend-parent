package com.times.cloud.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScans( value = @ComponentScan(basePackages = {"com.times.cloud.common", "com.times.cloud.mybatis"}) )
public class BackendTestApplication {

    private static final Logger logger = LoggerFactory.getLogger(BackendTestApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(BackendTestApplication.class, args);

//		ConfigurableApplicationContext context = SpringApplication.run(BackendTestApplication.class, args);

//		IUserService service = context.getBean("userServiceImpl", IUserService.class);
//
//		List<User> list = service.findAll();
//
//		for (User u : list) {
//			logger.info(u.toString());
//		}

	}
}
