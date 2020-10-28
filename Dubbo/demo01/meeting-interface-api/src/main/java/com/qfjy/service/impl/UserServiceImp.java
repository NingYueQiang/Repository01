package com.qfjy.service.impl;

import com.qfjy.pojo.User;
import com.qfjy.service.UserService;

/**
 * @author shkstart
 * @create 2020-10-20 11:16
*/

public class UserServiceImp implements UserService {
    @Override
    public User selectById(String id) {
        User user = new User();
        user.setId("001");
        user.setName("Tom");
        user.setTel("10086");
        return user;
    }
}
