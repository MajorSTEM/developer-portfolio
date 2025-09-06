-- drop schema
drop schema if exists professor;
-- new schema
create schema if not exists professor 
default character set utf8mb4
;
-- set target db
use professor;
-- 
-- new table without declared primary key
CREATE TABLE `professor` (
  `name` varchar(16) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
;
-- view table metadata
show table status;
-- insert 1st prof.
insert into professor (name, email) 
values ('Jie','jie1@xyz.com')
;
-- list table
select * from professor;
-- call built-in row_number function
select row_number() over() 
from professor
;
-- insert 2nd prof.
insert into professor (name, email) 
values ('Jie','jie1@xyz.com')
;
-- list table
select * from professor;
-- call built-in row_number function
select row_number() over() 
from professor
;

