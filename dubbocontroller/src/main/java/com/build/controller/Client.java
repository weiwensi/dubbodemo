package com.build.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Client {
    private static final Log log = LogFactory.getLog(Client.class);
    public static void main(String[] args) throws IOException {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springmvc.xml");
            context.start();
        } catch (Exception e) {
            log.error("== Client context start error:",e);
        }
        synchronized (Client.class) {
            while (true) {
                try {
                    Client.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:",e);
                }
            }
        }
    }
}
