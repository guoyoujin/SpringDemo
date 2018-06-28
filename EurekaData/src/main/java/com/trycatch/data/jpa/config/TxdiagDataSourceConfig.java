package com.trycatch.data.jpa.config;

import com.trycatch.data.jpa.txdiag.TxdiagRepository;
import com.trycatch.eurekabean.data.txdiag.entity.TxdiagEntity;
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

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackageClasses = {
            TxdiagRepository.class
    },
    repositoryImplementationPostfix = "Impl",
    entityManagerFactoryRef = "txdiagEntityManagerFactory",
    transactionManagerRef = "txdiagTransactionManager"
)
@Import(value = {PropertyConfig.class})
public class TxdiagDataSourceConfig extends JpaConfig{

    @Autowired
    @Qualifier("txdiagDataSource")
    private DataSource txdiagDataSource;

    @Value("${spring.jpa.hibernate.txdiag.persistence-unit}")
    String persistenceUnit;

    @Primary
    @Bean(name = "txdiagEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return txdiagEntityManagerFactory(builder).getObject().createEntityManager();
    }

    @Bean(name = "txdiagEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean txdiagEntityManagerFactory (EntityManagerFactoryBuilder builder) {
        Map<String,Object> jpaMap= buildProperties();
        return builder.dataSource(txdiagDataSource)
                .properties(jpaMap)
                .packages(TxdiagEntity.class)
                .persistenceUnit(persistenceUnit)
                .build();
    }

    @Bean(name="txdiagTransactionManager")
    @Autowired
    public PlatformTransactionManager txdiagTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(txdiagEntityManagerFactory(builder).getObject());
    }

}
