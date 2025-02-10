package com.onyou.project02.repository;

import org.springframework.data.repository.CrudRepository;

import com.onyou.project02.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}
