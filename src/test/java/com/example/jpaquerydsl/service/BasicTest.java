package com.example.jpaquerydsl.service;

import com.example.jpaquerydsl.service.dao.MemberDao;
import com.example.jpaquerydsl.service.domain.Member;
import com.example.jpaquerydsl.service.repository.MemberRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BasicTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberDao memberRepositorySupport;

    @AfterEach
    public void tearDown() throws Exception {
        memberRepository.deleteAllInBatch();
    }

    @Test
    public void querydsl_search_1() {
        String name = "junyeong";
        Integer age = 26;
        memberRepository.save(new Member(name, age, null));

        List<Member> result = memberRepositorySupport.findByName(name);

        assertThat(result.get(0).getAge()).isEqualTo(26);
    }
}
