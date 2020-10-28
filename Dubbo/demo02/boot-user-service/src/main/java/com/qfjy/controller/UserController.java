package com.qfjy.controller;

import com.qfjy.po.User;
import com.qfjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**

 */
@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("{id}")  // user/id
    public User selectUserById(@PathVariable("id") String id) {
        return userService.selectUserById(id);
    }

}
