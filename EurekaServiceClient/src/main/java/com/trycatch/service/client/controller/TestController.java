package com.trycatch.service.client.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/say")
    public String say() {
        return "hello test service, from port:";
    }

}
