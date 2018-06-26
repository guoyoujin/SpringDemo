package com.trycatch.data.jpa.config;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {
                "com.trycatch.data.jpa.txhims.repository",
                "com.trycatch.data.jpa.txhims.service"
        },
        entityManagerFactoryRef = "txhimsEntityManagerFactory",
        transactionManagerRef = "txhimsTransactionManager"
)

@Import(value = {PropertyConfig.class})
@Configuration
public class TxhimsDataSourceConfig extends JpaConfig{

    @Autowired
    @Qualifier("txhimsDataSource")
    private DataSource txhimsDataSource;

    @Value("${spring.jpa.hibernate.txhims.domain-package}")
    String domainPackage;

    @Value("${spring.jpa.hibernate.txhims.persistence-unit}")
    String persistenceUnit;

    @Bean(name = "txhimsEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
    }

    @Bean(name = "txhimsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary (EntityManagerFactoryBuilder builder) {
        Map<String,Object> jpaMap= buildProperties();
        jpaMap.put("hibernate.domain-package",domainPackage);
        return builder.dataSource(txhimsDataSource)
                .packages(domainPackage)
                .persistenceUnit(persistenceUnit)
                .properties(jpaMap)
                .build();
    }

    @Bean(name="txhimsTransactionManager")
    @Autowired
    public PlatformTransactionManager primaryTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
    }
}