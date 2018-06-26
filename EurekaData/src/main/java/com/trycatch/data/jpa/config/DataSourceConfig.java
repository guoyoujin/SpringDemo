package com.trycatch.data.jpa.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

@Configuration
@Import(value = {PropertyConfig.class})
public class DataSourceConfig {

    @Primary
    @Bean(name = "txdiagDataSource")
    @Qualifier("txdiagDataSource")
    @ConfigurationProperties("spring.datasource.txdiag")
    public DataSource txdiagDataSource() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "txhimsDataSource")
    @Qualifier("txhimsDataSource")
    @ConfigurationProperties("spring.datasource.txhims")
    public DataSource txhimsDataSource() {
        return DataSourceBuilder.create().build();
    }

}
