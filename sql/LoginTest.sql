drop database if exists LoginTest;
create database LoginTest;
use LoginTest;

create table login(
id varchar(255) not null primary key ,
password varchar(255) not null
);

insert into login values("test","test");
insert into login values("hosino","123");
insert into login values("nakagawa","123");
insert into login values("kotaki","123");
insert into login values("iwata","123");
insert into login values("arakawa","123");
insert into login values("yamazaki","123");
