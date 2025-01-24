CREATE USER IF NOT EXISTS 'springboot'@'%' IDENTIFIED BY 'springboot';

GRANT ALL PRIVILEGES ON *.* TO 'springboot'@'%';

CREATE DATABASE IF NOT EXISTS springbootDB;

USE springbootDB;
CREATE TABLE IF NOT EXISTS sample (
  id INT AUTOINCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

