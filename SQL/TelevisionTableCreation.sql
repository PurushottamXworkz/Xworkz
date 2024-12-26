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