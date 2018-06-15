package com.trycatch.eureka.service.req;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class EurekaServiceReqSpringApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServiceReqSpringApplication.class,args);
    }
}
