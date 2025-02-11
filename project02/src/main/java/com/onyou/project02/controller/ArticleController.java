package com.onyou.project02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onyou.project02.dto.ArticleForm;
import com.onyou.project02.entity.Article;
import com.onyou.project02.repository.ArticleRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Slf4j
@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        

        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());
        // 2. 리파지토리로 엔티티를 DB에 저장
        Article savedArticle = articleRepository.save(article);
        //System.out.println(savedArticle.toString());
        log.info(savedArticle.toString());
        return "";
    }
    
    

}
