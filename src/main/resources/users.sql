create database javaframework;
use javaframework;
CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20), age INT);
INSERT INTO users(NAME, age) VALUES('xiaoshuai', 23);
INSERT INTO users(NAME, age) VALUES('sunms', 24);

use javaframework;
CREATE TABLE account(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(20),MONEY DOUBLE);
INSERT INTO account(NAME,MONEY) VALUES('xiaoshuai',1000),("sunms",1000);	