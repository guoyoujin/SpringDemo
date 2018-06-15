package com.trycatch.eureke.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Service Registration Center
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication
{
    public static void main( String[] args )
    {
       new SpringApplicationBuilder(EurekaServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
