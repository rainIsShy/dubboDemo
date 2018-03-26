package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException{
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(c.getDisplayName() + ":here");
        c.start();
        System.out.println("服务已启动===>");
        System.in.read();
    }
}
