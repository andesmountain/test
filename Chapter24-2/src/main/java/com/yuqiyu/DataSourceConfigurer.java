package com.yuqiyu;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/30
 * Time：14:34
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class DataSourceConfigurer
{

    //test数据源
    @Bean(name="testDataSource")
    @ConfigurationProperties(prefix = "test.datasource")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }


    //rwtest数据源
    @Bean(name="rwtestDataSource")
    @Primary
    @ConfigurationProperties(prefix = "rwtest.datasource")
    public DataSource rwtestDataSource() {
        return DataSourceBuilder.create().build();
    }


}
