package com.trycatch.data.jpa;


import com.trycatch.data.jpa.entity.CommonEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.trycatch.data.jpa.entity","com.trycatch.data.jpa.service","com.trycatch.data.jpa.repository.dao"})
@EntityScan("com.trycatch.data.jpa")
@EnableJpaRepositories(basePackages = {"com.trycatch.data.jpa.repository"})
public class DataConfig {

}