package com.qfjy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qfjy.po.Account;
import com.qfjy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("account")
@Controller
public class AccountController {
    //@Autowired
    @Reference(check = false)
    private AccountService accountService;

    @ResponseBody
    @RequestMapping("uid/{uid}") // account/uid/123
    public Account selectByUid(@PathVariable("uid")String uid){
        return accountService.selectAccountByUid(uid);
    }
}
