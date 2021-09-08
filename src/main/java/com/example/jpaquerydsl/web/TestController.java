package com.example.jpaquerydsl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// Member 테이블에 값을 조회할때 쓰일 테스트 컨트롤러

@Controller
public class TestController {

    @GetMapping("/")
    public String index(){

        return "Success!";
    }
}
