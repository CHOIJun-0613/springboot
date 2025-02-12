package com.onyou.project02.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.onyou.project02.dto.MemberForm;
import com.onyou.project02.entity.Member;
import com.onyou.project02.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Slf4j
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
        //System.out.println(memberForm.toString());
        log.info(memberForm.toString());
        Member member = memberForm.toEntity();
        //System.out.println(member.toString());
        log.info(member.toString());
        Member saved = memberRepository.save(member);
        //System.out.println(saved.toString());
        log.info(saved.toString());
        return "redirect:/members/" + saved.getId();
    }
    @GetMapping("/members/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id = " + id);
        // 1. id를 조회해서 데이터 가져오기
        Member memberEntity = memberRepository.findById(id).orElse(null);
        // 2. 모델에 데이터 등록하기
        model.addAttribute("member", memberEntity);
        // 3. 뷰 페이지 반환하기
        return "members/show";
    }
    @GetMapping("/members")
    public String index(Model model) {
        // 1. 모든 데이터 가져오기
        ArrayList<Member> memberEntityList = memberRepository.findAll();
        // 2. 모델에 데이터 등록하기
        model.addAttribute("members", memberEntityList);
        // 3. 뷰 페이지 설정하기
        return "members/index";
    }
    @GetMapping("/members/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        // 1. 수정할 데이터 가져오기
        Member memberEntity = memberRepository.findById(id).orElse(null);
        // 2. 모델에 데이터 전달하기
        model.addAttribute("member", memberEntity);
        // 3. 뷰 페이지 설정하기
        return "members/edit";
    }
    
    @PostMapping("/members/update")
    public String update(MemberForm memberForm) {
        log.info(memberForm.toString());
        Member member = memberForm.toEntity();
        log.info(member.toString());

        Member target =  memberRepository.findById(member.getId()).orElse(null);
        if(target != null){
            memberRepository.save(member);
            log.info("update : " + member.getId());
        }

        return "redirect:/members/" + member.getId();
    }

    @GetMapping("/members/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
        log.info("delete member id : " + id);
        // 1. 삭제할 대상 가져오기
        Member target = memberRepository.findById(id).orElse(null);

        // 2. 대상 엔티티 삭제하기
        if(target != null){
            memberRepository.delete(target);
            log.info("id = " +id + " 번 사용자 삭제 완료");
            rttr.addFlashAttribute("msg", id + "번 사용자가 삭제되었습니다.");
        }
        // 3. 결과 페이지로 리다이렉트하기
        return "redirect:/members";
    }
    
    
    
    

}
