package com.onyou.project02.dto;

import com.onyou.project02.entity.Member;

public class MemberForm {
    private String email;
    private String password;
    public MemberForm(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public Member toEntity(){
        return new Member(null, email, password);
    }

}
