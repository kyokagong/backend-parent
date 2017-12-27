package com.times.cloud.web.web;

import com.times.cloud.web.feign.IUuidFeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * @author ly
 * @date 2017/12/19 10:44
 * @desc welcome controller
 */
@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @Resource
    private IUuidFeignService uuidFeignService;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "main";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }


    @RequestMapping("/uuid")
    public String uuid() {
        String uuid = uuidFeignService.getUUID();
        System.out.println(uuid);
        return "main";
    }
}
