package com.xphsc.easyjdbc.config;



import com.xphsc.easyjdbc.EasyJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by ${huipei.x}
 */
@Configuration
@EnableConfigurationProperties(EasyJdbcProperties.class)
@AutoConfigureAfter(JdbcTemplateAutoConfiguration.class)
public class EasyJdbcAutoConfiguration {

    private final DataSource dataSource;
    @Autowired
    private EasyJdbcProperties easyJdbcProperties;
    public EasyJdbcAutoConfiguration(DataSource dataSource) {
        this.dataSource=dataSource;
    }

    @Bean
    public EasyJdbcTemplate easyJdbcTemplate() {
        return new EasyJdbcTemplate(this.dataSource,easyJdbcProperties.getDialect());
    }
}
