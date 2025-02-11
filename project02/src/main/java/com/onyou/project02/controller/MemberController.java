package com.onyou.project02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.onyou.project02.dto.MemberForm;
import com.onyou.project02.entity.Member;
import com.onyou.project02.repository.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signup")
    public String signUpPage() {
        return "members/new";
    }

    @PostMapping("/join")
    public String join(MemberForm memberForm) {
        System.out.println(memberForm.toString());
        Member member = memberForm.toEntity();
        System.out.println(member.toString());
        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());
        return "";
    }
    
    

}
