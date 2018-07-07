package com.trycatch.service.client;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication(
    scanBasePackages = {
        "com.trycatch.service.client",
        "com.trycatch.data.jpa"
    },
    exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
    }
)
@EnableDiscoveryClient
public class EurekaServiceClientApplication
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(EurekaServiceClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
