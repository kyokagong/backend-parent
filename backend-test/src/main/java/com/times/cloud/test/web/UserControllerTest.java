package com.times.cloud.test.web;

import com.times.cloud.common.bean.mysql.User;
import com.times.cloud.test.feign.IUserFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author ly
 * @date 2017/12/19 16:13
 * @desc 用户微服务测试
 */
@RestController
public class UserControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Resource
    private IUserFeignService userFeignService;

    @PostMapping("/register")
    public String register() {
        return userFeignService.register();
    }

    @GetMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userFeignService.login(username, password);
    }

    @PostMapping("/post")
    public User testPost(@RequestBody User user) {
        return userFeignService.testPost(user);
    }

    @GetMapping("/get")
    public String testGet() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "getTest");
        map.put("password", "password");
        return userFeignService.testGet(map);
    }
}
