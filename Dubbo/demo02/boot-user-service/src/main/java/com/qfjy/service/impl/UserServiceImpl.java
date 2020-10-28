package com.qfjy.service.impl;
import com.alibaba.dubbo.config.annotation.Reference;
import com.qfjy.mapper.UserMapper;

import com.qfjy.po.Account;
import com.qfjy.po.User;
import com.qfjy.service.AccountService;
import com.qfjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@com.alibaba.dubbo.config.annotation.Service //暴露服务，服务的提供者
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper userMapper;

   @Reference(check = false,loadbalance = "roundRobin")
   private AccountService accountService;


    /**
     * 根据用户主键ID查询用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User selectUserById(String id) {
        User user =  userMapper.selectByPrimaryKey(id);

        //根据查询到用户信息， 查询当前用户的余额帐户信息
        System.out.println("accountService+"+accountService);
        Account account= accountService.selectAccountByUid(user.getId());
        System.out.println("当前用户"+user.getName()+"帐户信息是："+account);
        user.setAccount(account);
        return user;
    }
}
