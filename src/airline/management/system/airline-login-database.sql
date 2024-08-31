

create database airlinemanagementsystem;


use airlinemanagementsystem;



create table login(username varchar(20), password varchar(20));



insert into login values('admin', 'admin');



create table passenger (name varchar(20), nationality varchar(20), phone varchar(15), address varchar(50), aadhar varchar(20), gender varchar(20));



create table flight(f_code varchar(20), f_name varchar(20), source varchar(40), destination varchar(40));



insert into flight values("1001", "US-1212", "Washington DC", "New York");
insert into flight values("1002", "US-1453", "Los Angelis", "San Fransisco");
insert into flight values("1003", "US-1112", "Florida", "Boston");
insert into flight values("1004", "US-3222", "Texas", "Georgia");
insert into flight values("1005", "US-1212", "Arizona", "Colarado");



select * from flight;

create table reservation(PNR varchar(15), TICKET varchar(20), aadhar varchar(20), name varchar(20), nationality varchar(30), flightname varchar(15), flightcode varchar(20), src varchar(30), des varchar(30), ddate varchar(30));



create table cancel(pnr varchar(20), name varchar(40), cancelno varchar(20), fcode varchar(20), ddate varchar(30));
select * from cancel;
