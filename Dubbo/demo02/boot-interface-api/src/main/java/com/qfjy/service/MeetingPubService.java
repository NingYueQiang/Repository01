package com.qfjy.service;

import com.qfjy.po.MeetingPub;

public interface MeetingPubService {

    /**
     * 根据会议编号 查询会议信息
     */
    MeetingPub selectMeetingPubByPcode(String pcode);

}
