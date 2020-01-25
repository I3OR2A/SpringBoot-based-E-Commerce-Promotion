package com.imooc.miaosha.service.impl;

import com.imooc.miaosha.MiaoshaApplicationTests;
import com.imooc.miaosha.service.model.UserModel;
import com.imooc.miaosha.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserServiceImplTest extends MiaoshaApplicationTests {

    @Autowired
    IUserService userService;

    @Test
    public void getUserById() {
        UserModel userModel = userService.getUserById(1);
        log.info("result={}", userModel);
    }
}