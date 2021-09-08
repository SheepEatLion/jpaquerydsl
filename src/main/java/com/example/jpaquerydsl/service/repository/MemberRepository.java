package com.example.jpaquerydsl.service.repository;


// JPA 기능을 활용할 인터페이스

import com.example.jpaquerydsl.service.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
