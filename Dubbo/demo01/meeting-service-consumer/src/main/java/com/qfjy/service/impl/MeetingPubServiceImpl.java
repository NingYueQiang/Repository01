package com.qfjy.service.impl;

import com.qfjy.pojo.User;
import com.qfjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author shkstart
 * @create 2020-10-20 11:34
 */
@Service  // 要在配置文件中加上xml头文件 和 配置扫描标签
public class MeetingPubServiceImpl implements MeetingPubService {
    @Autowired
    private UserService userService;

    @Override
    public MeetingPub selectByPcode(String pcode) {
        MeetingPub meetingPub = new MeetingPub();
        meetingPub.setId("1001");
        meetingPub.setUid("001");
        meetingPub.setPcode(pcode);
        meetingPub.setTitle("Study Dubbo");
        meetingPub.setContent("Dubbo is a high quality RPC tool");

        /*
    还要根据uid 查询服务的发起者信息，需要调用user-service模块,根据服务的最佳化实现：
    User是服务的模型，UserService.selectById是服务的接口，都应该放在API包中
        User u = UserService.selectById(meetingPub.getUid())
       meetingPub.setUser(u);

         */

        System.out.println("===远程服务访问====:" +userService);
        User u = userService.selectById(meetingPub.getUid());
        meetingPub.setUser(u);
        return meetingPub;
    }
}
