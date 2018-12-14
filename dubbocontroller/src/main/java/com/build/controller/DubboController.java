package com.build.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.build.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboController {

    @Reference
    private DemoService service;
    @RequestMapping(value = "/dubbo/demo")
    @ResponseBody
    public String hello(){
        return service.hello();
    }

}
