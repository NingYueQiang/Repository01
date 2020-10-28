package com.qfjy.service.impl;

import com.qfjy.po.Account;
import com.qfjy.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@com.alibaba.dubbo.config.annotation.Service
public class AccountServiceImpl implements AccountService {
    /**
     * 通过用户ID查询余额信息
     *
     * @param uid
     */
    @Override
    public Account selectAccountByUid(String uid) {
        Account account=new Account();
        account.setId("11111111000000001111");
        account.setUid(uid);
        account.setBalance(1200000);
        return account;
    }
}
