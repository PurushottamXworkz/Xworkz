create database country;

use country;

create table citizen(
citizen_id varchar(12),
citizen_name varchar(20),
citizen_phone bigint,
citizen_gender char(1),
citizen_address varchar(20),
citizen_dob date
);
desc citizen;
alter table citizen modify column citizen_id int;

alter table citizen rename column citizen_name to name;
alter table citizen drop 



rename table citizen to people;
 drop table people; 
 
 select * from citizen;