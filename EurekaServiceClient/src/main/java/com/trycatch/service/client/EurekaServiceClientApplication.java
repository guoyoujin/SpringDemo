package com.trycatch.service.client;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EntityScan("com.trycatch.eurka.service.client")
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceClientApplication
{
    public static void main( String[] args )
    {
         new SpringApplicationBuilder(EurekaServiceClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
