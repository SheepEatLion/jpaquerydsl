package com.example.jpaquerydsl.service;


import com.example.jpaquerydsl.service.domain.Member;
import com.example.jpaquerydsl.service.repository.MemberRepository;
import com.example.jpaquerydsl.web.dto.MemberSaveDto;
import com.example.jpaquerydsl.web.dto.MemberUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public Long save(MemberSaveDto requestDto) {
        return memberRepository.save(requestDto.toEntity()).getId();
    }

    public Long update(Long id, MemberUpdateDto requestDto) {
        Member member = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 멤버"));
        member.update(requestDto.getName(), requestDto.getAge(), requestDto.getTeam());
        return id;
    }
}
