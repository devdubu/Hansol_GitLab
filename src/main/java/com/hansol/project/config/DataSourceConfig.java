package com.hansol.project.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}

/*
* @Configurtion
* 어노테이션 기반 환경 구성을 도움
* 이 어노테이션을 붙이고 클래스 내에 하나 이상의 @Bean 메소드를 구현하면 스프링 컨테이너가 Bean 정의를 생성하고 런타임 버그시
* Bean들의 요청을 처리할 것을 선언
*
* @ConfiguationProperties
* application.properties의 key를 같은 값으로 시작하게 구현해두면, 이를 묶어서 Bean으로 등록 가능
* 위 코드처럼 prefix="spring.datasource"라고 하면 spring.datasource가 접두어로 붙어있는 application.properties 값들을 참조할 수 있다.
*
* 혹여라도 ConfigurationProperties를 사용하지 않는다면
* public DataSource dataSource(){
*   return DataSourceBuilder
*       .create()
*       .username("Mysql유저이름")
*       .password("Mysql 비밀번호")
*       .url("Mysql 경로")
*       .driverClassName("com.mysql.jdbc.Driver")
*       .build();
* }
* */
