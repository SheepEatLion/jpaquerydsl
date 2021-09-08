package com.example.jpaquerydsl.web.dto;

import com.example.jpaquerydsl.service.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSaveDto {

    private String name;

    @Builder
    public MemberSaveDto(String name){
        this.name = name;
    }

    public Member toEntity(){
        return Member.builder().name(name).build();
    }
}
