package com.example.jpaquerydsl.web.dto;

import com.example.jpaquerydsl.service.domain.Team;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdateDto {
    private String name;
    private Integer age;
    private Team team;

    @Builder
    public MemberUpdateDto(String name, Integer age, Team team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }
}
