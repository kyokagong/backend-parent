package com.times.cloud.user.service.web;

import com.times.cloud.common.bean.mysql.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author ly
 * @date 2017/12/15 17:04
 * @desc user service对外暴露的restApi
 */
@RestController
public class UserController {

    @PostMapping(value = "/register")
    public String register() {
        return "register";
    }

    @GetMapping(value = "/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password) {
        return username + ":" + password;
    }

    @PostMapping("/test/post")
    public User testPost(@RequestBody User user) {
        user.setUserName("PostUser");
        return user;
    }

    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    public String testGet(@RequestParam Map<String, Object> map) {
        return String.valueOf(map);
    }
}
