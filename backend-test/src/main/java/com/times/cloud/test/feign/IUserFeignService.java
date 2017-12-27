package com.times.cloud.test.feign;

import com.times.cloud.common.bean.mysql.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Administrator on 2017/12/19.
 */
@FeignClient(name = "backend-user-service")
public interface IUserFeignService {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    String register();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    String login(@RequestParam("username")String username, @RequestParam("password")String password);

    @RequestMapping(value = "/test/post", method = RequestMethod.POST)
    User testPost(@RequestBody User user);

    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    String testGet(@RequestParam Map<String, Object> map);
}
