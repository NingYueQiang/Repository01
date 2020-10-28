package com.qfjy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:consumer.xml"}
        );
        context.start();

        MeetingPubService meetingPubService = context.getBean(MeetingPubService.class);
        // selectByPcode 方法内调用远程方法
        MeetingPub meetingPub = meetingPubService.selectByPcode("1001");

        System.out.println(meetingPub);
        System.in.read(); // 加一个阻塞，以便在监控中心能看到该服务
    }
}
