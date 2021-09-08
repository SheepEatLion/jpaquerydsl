package com.example.jpaquerydsl.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// Querydsl 을 위한 설정 클래스, 이 설정으로 프로젝트 어느 곳에서나 JPAQueryFactory 를 DI 하여 Querydsl 을 사용할 수 있다.
@Configuration
public class QuerydslConfig {

    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory() { return new JPAQueryFactory(entityManager); }
}
