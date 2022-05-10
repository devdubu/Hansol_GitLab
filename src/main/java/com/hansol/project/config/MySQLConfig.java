package com.hansol.project.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.hansol.project.dao")
public class MySQLConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mappers/*.xml"));

        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");
        sessionFactory.setConfigLocation(myBatisConfig);

        return sessionFactory.getObject();
    }
}

/*
* @MapperScan
*  연결할 DAO 인터페이스를 담은 패키지를 등록한다. @MapperScan(basePackage={"com.hansol.project.dao"}라고 정의 가능
*
* SqlSessionFactory
*  MySql과 MyBatis를 연결해주는 객체
* SqlSessionFactoryBean
*  SqlSessionFactory를 생성해주는 클래스
* setDataSource()
*  앞서 정의한 datasource를 참조하게 된다.
* PathMatchingResourcePatternResolver
*  resource위치 검색을 돕는 Spring class
*  getResoruces()로 경로 검색을 해 SqlSessionFactory에 mapper와 mybatis-config를 set 해준다.
* classpath
*  resource 폴더를 나타냄
*
* */
