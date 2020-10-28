package com.qfjy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2020-10-20 11:30
 */
@Data
public class MeetingPub implements Serializable {
    private String id;

    //会议编号
    private String pcode;
    private String content;
    private String title;
    //谁发布的会议
    private String uid;
    private User user;


}
