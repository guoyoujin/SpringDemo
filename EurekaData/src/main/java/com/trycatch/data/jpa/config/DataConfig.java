package com.trycatch.data.jpa.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.trycatch.data.jpa.service","com.trycatch.data.jpa.repository"})
@EnableJpaRepositories(basePackages = {"com.trycatch.data.jpa.repository"})
@EntityScan("com.trycatch.eurekabean.data.entity")
public class DataConfig {

}