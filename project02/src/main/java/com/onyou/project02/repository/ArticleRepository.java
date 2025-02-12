package com.onyou.project02.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.onyou.project02.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

    @Override
    ArrayList<Article> findAll();
}
