package com.qfjy.service;

import com.qfjy.po.Account;

public interface AccountService {

    /**
     * 通过用户ID查询余额信息
     */
    public Account selectAccountByUid(String uid);

}
