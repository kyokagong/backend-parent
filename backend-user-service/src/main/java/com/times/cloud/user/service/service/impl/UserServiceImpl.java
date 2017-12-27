package com.times.cloud.user.service.service.impl;

import com.times.cloud.common.bean.mysql.User;
import com.times.cloud.mybatis.core.AbstractService;
import com.times.cloud.mybatis.mapper.UserMapper;
import com.times.cloud.user.service.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ly
 * @date 2017/12/8 19:49
 * @desc user service impl
 */
@Service
public class UserServiceImpl extends AbstractService<User> implements IUserService {

    @Resource
    private UserMapper userMapper;
}
