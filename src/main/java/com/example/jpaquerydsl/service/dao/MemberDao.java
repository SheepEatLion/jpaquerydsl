package com.example.jpaquerydsl.service.dao;

// Querydsl 을 활용하여 Member 테이블에 접근한 뒤 동적쿼리 조회를 할 dao

import com.example.jpaquerydsl.service.domain.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.jpaquerydsl.service.domain.QMember.member;

@Repository
public class MemberDao extends QuerydslRepositorySupport {

    private final JPAQueryFactory queryFactory;

    public MemberDao(JPAQueryFactory queryFactory) {
        super(Member.class);
        this.queryFactory = queryFactory;
    }

    public List<Member> findByName(String name) {
        return queryFactory
                .selectFrom(member)
                .where(member.name.eq(name))
                .fetch();
    }
}
