package com.onyou.project02.dto;

import com.onyou.project02.entity.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class MemberForm {
    private Long id;
    private String email;
    private String password;

    public Member toEntity(){
        return new Member(id, email, password);
    }

}
