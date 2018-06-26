package com.trycatch.data.jpa.config;

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
        "com.trycatch.data.jpa.txdiag.repository",
        "com.trycatch.data.jpa.txdiag.service"
    },
    entityManagerFactoryRef = "txdiagEntityManagerFactory",
    transactionManagerRef = "txdiagTransactionManager"
)

@Import(value = {PropertyConfig.class})
@Configuration
public class TxdiagDataSourceConfig extends JpaConfig{

    @Autowired
    @Qualifier("txdiagDataSource")
    private DataSource txdiagDataSource;

    @Value("${spring.jpa.hibernate.txdiag.domain-package}")
    String domainPackage;

    @Value("${spring.jpa.hibernate.txdiag.persistence-unit}")
    String persistenceUnit;

    @Primary
    @Bean(name = "txdiagEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
    }

    @Bean(name = "txdiagEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary (EntityManagerFactoryBuilder builder) {
        Map<String,Object> jpaMap= buildProperties();
        jpaMap.put("hibernate.domain-package",domainPackage);
        return builder.dataSource(txdiagDataSource)
                .packages(domainPackage)
                .persistenceUnit(persistenceUnit)
                .properties(jpaMap)
                .build();
    }

    @Bean(name="txdiagTransactionManager")
    @Autowired
    public PlatformTransactionManager primaryTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
    }

}
