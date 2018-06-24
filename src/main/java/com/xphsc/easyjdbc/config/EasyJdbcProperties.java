package com.xphsc.easyjdbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${huipei.x}
 */
@Configuration
@ConfigurationProperties(prefix = "easyjdbc")
public class EasyJdbcProperties {

    private String dialect;

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }
}
