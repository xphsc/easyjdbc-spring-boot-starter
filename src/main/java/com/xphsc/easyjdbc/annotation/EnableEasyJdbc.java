package com.xphsc.easyjdbc.annotation;

import com.xphsc.easyjdbc.config.EasyJdbcAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by ${huipei.x}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EasyJdbcAutoConfiguration.class)
public @interface EnableEasyJdbc {
}
