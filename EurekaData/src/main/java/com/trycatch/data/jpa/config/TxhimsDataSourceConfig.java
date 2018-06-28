package com.trycatch.data.jpa.config;

import com.trycatch.data.jpa.txhims.TxhimsRepository;
import com.trycatch.eurekabean.data.txhims.entity.TxhimsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@EnableJpaRepositories(
        basePackageClasses = {
                TxhimsRepository.class
        },
        entityManagerFactoryRef = "txhimsEntityManagerFactory",
        transactionManagerRef = "txhimsTransactionManager",
        repositoryImplementationPostfix = "Impl"
)
@EnableTransactionManagement
@Import(value = {PropertyConfig.class})
@Configuration
public class TxhimsDataSourceConfig extends JpaConfig{
    private final static Logger logger = LoggerFactory.getLogger(TxhimsDataSourceConfig.class);

    @Autowired
    @Qualifier(value="txhimsDataSource")
    private DataSource txhimsDataSource;

    @Value("${spring.jpa.hibernate.txhims.persistence-unit}")
    String persistenceUnit;

    @Bean(name = "txhimsEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return txhimsEntityManagerFactory(builder).getObject().createEntityManager();
    }

    @Bean(name = "txhimsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean txhimsEntityManagerFactory (EntityManagerFactoryBuilder builder) {
        Map<String,Object> jpaMap= buildProperties();
        return builder.dataSource(txhimsDataSource)
                .properties(jpaMap)
                .packages(TxhimsEntity.class)
                .persistenceUnit(persistenceUnit)
                .build();
    }

    @Bean(name="txhimsTransactionManager")
    public PlatformTransactionManager txhimsTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(txhimsEntityManagerFactory(builder).getObject());
    }
}