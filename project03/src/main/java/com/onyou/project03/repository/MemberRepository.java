package com.onyou.project03.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.onyou.project03.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{
    @Override
    ArrayList<Member> findAll();
}
