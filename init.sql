CREATE USER IF NOT EXISTS 'springboot'@'%' IDENTIFIED BY 'springboot';

GRANT ALL PRIVILEGES ON *.* TO 'springboot'@'%';

CREATE DATABASE IF NOT EXISTS springbootDB;

USE springbootDB;
CREATE TABLE IF NOT EXISTS sample_table (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    create_time DATETIME COMMENT 'Create Time',
    name VARCHAR(255)
) COMMENT 'Sample';

INSERT sample_table(name) VALUES('initdata');


