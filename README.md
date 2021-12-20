# demo
 The project where user login and if it's elligible then fill the form
 
Important SQL queries to run the project:


CREATE SCHEMA `secure_deployment` ;
CREATE TABLE `secure_deployment`.`user_login` (
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `form_permission` BIT NOT NULL,
  PRIMARY KEY (`username`));


insert into user_login (username, password, form_permission)
values ('surbhi','surbhi',1);

insert into user_login (username, password, form_permission)
values ('admin','surbhi',0);

CREATE TABLE `secure_deployment`.`go_get_form` (
  `username` VARCHAR(45) NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `address` VARCHAR(50) NOT NULL,
  `phone` VARCHAR(10) NOT NULL,
  `city` VARCHAR(100) NOT NULL,
  `state` VARCHAR(100) NOT NULL,
  `country` VARCHAR(60) NOT NULL,
  `pincode` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`username`));


jdbc:mysql://localhost:3306/secure_deployment

