package com.xuefei.order.seata.common.config;

import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName DataSourceProxyConfig
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/25 23:26
 * @Version 1.0
 **/
@Configuration
public class DataSourceProxyConfig {

    @Bean
    public DataSourceProxy dataSourceProxy(DataSource dataSource) {
        return new DataSourceProxy(dataSource);
    }
}
