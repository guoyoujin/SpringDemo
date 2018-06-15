package com.trycatch.eureka.service.req.controller;

import com.trycatch.eureka.service.req.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/say")
    public String say(){
        return testService.say();
    }
}
