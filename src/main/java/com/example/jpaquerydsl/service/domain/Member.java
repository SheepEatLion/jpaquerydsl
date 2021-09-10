package com.example.jpaquerydsl.service.domain;

// Member 테이블과 매핑될 엔티티 클래스

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    // 생성자 패턴 중에서 빌더 패턴 적용;
    @Builder
    public Member(String name, Integer age, Team team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    // persistence context 가 엔티티의 변화 감지하면 update 메서드를 호출할 것.
    public void update(String name, Integer age, Team team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }
}
