package com.times.cloud.mybatis.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.sql.DataSource;

/**
 * @author ly
 * @date 2017/12/7 20:50
 * @desc druid datasource config
 */
@Configuration
@DependsOn(value = {"springUtil", "redisTemplate"})
//@MapperScan(basePackages = "com.times.cloud.mybatis.mapper", sqlSessionTemplateRef = "druidSqlSessionTemplate")
@MapperScan(basePackages = "com.times.cloud.mybatis.mapper")
public class DataSourceConfig {

//    @Bean(name = "druidDataSource")
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource() {
        return DruidDataSourceBuilder
                .create()
                .build();
    }

//    @Bean(name = "druidSqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("druidDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        return bean.getObject();
//    }
////
//    @Bean(name = "druidTransactionManager")
//    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("druidDataSource") DataSource dataSource) throws Exception {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "druidSqlSessionTemplate")
//    @Primary
//    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("druidSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
}
