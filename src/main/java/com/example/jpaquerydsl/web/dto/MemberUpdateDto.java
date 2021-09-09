package com.example.jpaquerydsl.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdateDto {
    private String name;

    @Builder
    public MemberUpdateDto(String name) {
        this.name = name;
    }
}
