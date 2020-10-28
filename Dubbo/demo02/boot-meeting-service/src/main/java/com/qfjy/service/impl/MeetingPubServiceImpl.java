package com.qfjy.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qfjy.mapper.MeetingPubMapper;

import com.qfjy.po.MeetingPub;
import com.qfjy.service.MeetingPubService;
import com.qfjy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname MeetingPubServiceImpl
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/12/3 14:36
 * @Created by Administrator
 */
@Service
public class MeetingPubServiceImpl implements MeetingPubService {
    @Autowired
    private MeetingPubMapper meetingPubMapper;

    @Reference   //引用Dubbo提供的服务接口
    private UserService userService;


    @Override
    public MeetingPub selectMeetingPubByPcode(String pcode) {
        MeetingPub meetingPub = meetingPubMapper.selectMeetingPubByPcode(pcode);
        // 服务调用
        meetingPub.setUser(userService.selectUserById(meetingPub.getUid()));
        return meetingPub;
    }
}
