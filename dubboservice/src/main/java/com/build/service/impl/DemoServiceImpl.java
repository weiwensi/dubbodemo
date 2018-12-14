package com.build.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.build.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello() {
        return "hello Dubbo";
    }
}
