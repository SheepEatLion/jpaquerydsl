package com.example.jpaquerydsl.service;


import com.example.jpaquerydsl.service.repository.MemberRepository;
import com.example.jpaquerydsl.web.dto.MemberSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public Long save(MemberSaveDto requestDto) {
        return memberRepository.save(requestDto.toEntity()).getId();
    }

}
