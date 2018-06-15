package com.trycatch.eureka.service.req.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String say(){
        return restTemplate.getForObject("http://service-test/say",String.class);
    }

    public String testError(){
        return "error";
    }
}
