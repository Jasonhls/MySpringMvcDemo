package com.cn.controller;

import com.cn.mapper.UserMapper;
import com.cn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-26 16:00
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    /**
     *这里虽然是@RestController ，但是也需要配置java对象转换为json传的转换器，比如：
     * Spring3.x 用 MappingJacksonHttpMessageConverter
     * Spring4.x 用 MappingJackson2HttpMessageConverter
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getUser")
    public User get(Integer id) {
        return userMapper.getUserById(id);
    }
}
