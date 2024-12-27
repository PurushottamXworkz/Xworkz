create database electronicDevices;

use electronicDevices;

create table television(
television_id varchar(12),
television_brand varchar(20),
distributor_phone bigint,
distributor_address varchar(20),
purchase_date date,
bill float
);

desc television;

rename table television to tv;
drop table tv;

alter table television add column distributor_id int;

alter table television drop column distributor_id;
