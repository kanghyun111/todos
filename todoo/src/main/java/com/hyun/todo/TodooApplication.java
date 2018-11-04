package com.hyun.todo;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(basePackages="com.hyun.todo.mapper")
public class TodooApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TodooApplication.class, args);
	}
	
	@Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource, ApplicationContext applicationContext)
            throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

        // 마이바티스가 사용한 DataSource를 등록
        factoryBean.setDataSource(dataSource);
        // 마이바티스 프로퍼티 설정
        Properties mybatisProperties = new Properties();
        mybatisProperties.setProperty("lazyLoadingEnabled", "true");
        mybatisProperties.setProperty("aggressiveLazyLoading", "false");
        mybatisProperties.setProperty("lazyLoadTriggerMethods", "");
        mybatisProperties.setProperty("mapUnderscoreToCamelCase", "true");
   //     mybatisProperties.setProperty("mapperLocations", "classpath:mybatis/mapper/*.xml");
        factoryBean.setConfigurationProperties(mybatisProperties);
        
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        Resource[] resources = resolver.getResources("classpath:mybatis/mapper/*.xml");
        factoryBean.setMapperLocations(resources);
        factoryBean.setTypeAliasesPackage("com.hyun.todo.model");

        return factoryBean;
    }
}
