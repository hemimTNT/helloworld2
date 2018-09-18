package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "com.example.demo.mapper.other", sqlSessionFactoryRef = "otherSqlSessionFactory")
public class OtherDataSourceConfig {
	@Bean(name = "otherDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.other")
	public DataSource setDataSource() {
		return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
	}

	@Bean(name = "otherTransactionManager")
	public DataSourceTransactionManager setTransactionManager(@Qualifier("otherDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "otherSqlSessionFactory")
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("otherDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mappers/other/*.xml"));
		return bean.getObject();
	}

	@Bean(name = "otherSqlSessionTemplate")
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("otherSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
