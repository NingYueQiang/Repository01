package com.qfjy.service;

import com.qfjy.po.User;

public interface UserService {
    /**
     * 根据用户主键ID查询用户信息
     * @return
     */
     User selectUserById(String id);
}
