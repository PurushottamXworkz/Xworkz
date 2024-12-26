create database marrige;

use marrige;

create table catering(
dish_id varchar(12),
dish_name varchar(20),
catering_phone bigint,
dish_type char(5),
order_date date,
order_number int,
total_bill float
);

desc catering;