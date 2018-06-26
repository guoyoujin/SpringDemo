package com.trycatch.data.jpa.config;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;

import java.util.HashMap;
import java.util.Map;

@Import(value = {PropertyConfig.class})
public class JpaConfig {
    @Value("${spring.jpa.hibernate.ddl-auto}")
    String dll;
    @Value("${spring.jpa.hibernate.dialect}")
    String dialect;
    @Value("${spring.jpa.show-sql}")
    String showSql;

    public Map<String, Object> buildProperties() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.ejb.naming_strategy", ImprovedNamingStrategy.class.getName());
        properties.put("hibernate.hbm2ddl.auto", dll);
        properties.put("hibernate.dialect", dialect);
        properties.put("hibernate.show_sql", showSql);
        return properties;
    }
}
