package com.qfjy.controller;

import com.qfjy.po.MeetingPub;
import com.qfjy.service.MeetingPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("meetingPub")
@Controller
public class MeetingPubController {
    @Autowired
    private MeetingPubService meetingPubService;

    @ResponseBody
    @RequestMapping("pcode/{pcode}")  // meetingPub/pcode/20191203001
    public MeetingPub selectByPcode(@PathVariable("pcode") String pcode) {
        MeetingPub meetingPub = meetingPubService.selectMeetingPubByPcode(pcode);
        return meetingPub;
    }
}
