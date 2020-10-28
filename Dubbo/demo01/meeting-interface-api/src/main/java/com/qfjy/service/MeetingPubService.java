package com.qfjy.service;

import com.qfjy.pojo.MeetingPub;

/**
 * @author shkstart
 * @create 2020-10-20 11:33
 */
public interface MeetingPubService {
    //根据会议的编号查询会议的详细信息
    MeetingPub selectByPcode(String pcode);

}
