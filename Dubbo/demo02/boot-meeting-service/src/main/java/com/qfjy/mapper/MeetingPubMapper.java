package com.qfjy.mapper;

import com.qfjy.po.MeetingPub;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingPubMapper {
    int deleteByPrimaryKey(String id);

    int insert(MeetingPub record);

    int insertSelective(MeetingPub record);

    MeetingPub selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MeetingPub record);

    int updateByPrimaryKey(MeetingPub record);

    /**
     * 根据会议编号 查询会议信息
     */
    @Select(" select * from meetingPub where pcode=#{pcode}")
    MeetingPub selectMeetingPubByPcode(String pcode);

}