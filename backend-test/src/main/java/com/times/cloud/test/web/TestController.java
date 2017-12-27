package com.times.cloud.test.web;

import com.times.cloud.test.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private IUserService userService;

    @Value("${from}")
    private String from;

    @Value("${spring.redis.host}")
    private String host;

    @RequestMapping("/from")
    public String from() {
        logger.info("host:{}", host);
        userService.findAll();
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

}