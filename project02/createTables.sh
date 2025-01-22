
create table products (
  id int primary key,
  name varchar(100) not null,
  price int default 0 not null,
  description varchar(100) 
);