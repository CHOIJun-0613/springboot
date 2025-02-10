DROP TABLE article;
CREATE TABLE IF NOT EXISTS article(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    title VARCHAR(255),
    content VARCHAR(4000)
) COMMENT 'Article';

Drop TABLE coffee;
CREATE TABLE IF NOT EXISTS coffee(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    name VARCHAR(255),
    price VARCHAR(10)
) COMMENT 'Coffee';

DROP TABLE comment;
CREATE TABLE IF NOT EXISTS comment(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    article_id int NOT NULL,
    nickname VARCHAR(255),
    body VARCHAR(4000)
) COMMENT 'Comment';

Drop TABLE member;
CREATE TABLE IF NOT EXISTS member(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    email int NOT NULL,
    password VARCHAR(50)
) COMMENT 'Member';