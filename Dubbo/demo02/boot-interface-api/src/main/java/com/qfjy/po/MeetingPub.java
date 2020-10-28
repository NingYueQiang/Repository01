package com.qfjy.po;

import lombok.Data;

import java.util.Date;

@Data
public class MeetingPub {
    private String id;

    private String pcode;

    private String ptime;

    private String tname;

    private String ptitle;

    private String pzone;

    private String uid;

    private String remark;

    private Date createdate;

    private Short status;
    /**一对一关联 */
    private User user;


}