package com.yuqiyu;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Auther: ycig
 * @Date: 2018/7/26 15:26
 * @Description:
 */
@Configuration
@MapperScan(basePackages = {"com.yuqiyu.chapter24.rwtest.mapper"}, sqlSessionTemplateRef = "rwtestSqlSessionTemplate")
public class RwtestMybatisConfig {

    @Bean
    public SqlSessionFactory rwtestSqlSessionFactory(@Qualifier("rwtestDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath*:mapper/rwtest/*Mapper.xml"));
            bean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate rwtestSqlSessionTemplate(@Qualifier("rwtestSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        // 使用上面配置的Factory
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
        return template;
    }
}
