package com.trycatch.service.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EntityScan("com.trycatch.eurka.service.client")
@SpringBootApplication
@EnableEurekaClient
public class Application
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
