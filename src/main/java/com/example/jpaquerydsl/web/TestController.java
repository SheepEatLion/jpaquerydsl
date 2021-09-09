package com.example.jpaquerydsl.web;

import com.example.jpaquerydsl.service.MemberService;
import com.example.jpaquerydsl.web.dto.MemberSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// Member 테이블에 값을 조회할때 쓰일 테스트 컨트롤러

@RequiredArgsConstructor
@Controller
public class TestController {

    private final MemberService memberService;

    @PostMapping("/save")
    public Long save(@RequestBody MemberSaveDto requestDto){
        return memberService.save(requestDto);
    }

    @GetMapping("/read")
    public
}
