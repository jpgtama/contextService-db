-- create database: fileStore

CREATE DATABASE IF NOT EXISTS fileStore CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- create table: Book
CREATE TABLE IF NOT EXISTS Book
(
	id int NOT NULL AUTO_INCREMENT,
	uid varchar(255),
	name varchar(255),
	filePath varchar(255),
	hash varchar(255),
	privateOnly tinyint(1),
	PRIMARY KEY (ID)
);

-- create table: User
CREATE TABLE IF NOT EXISTS User
(
	id int NOT NULL AUTO_INCREMENT,
	uid varchar(255),
	extId varchar(255),
	name varchar(255),
	PRIMARY KEY (ID)
);



-- create table: UserBook
CREATE TABLE IF NOT EXISTS UserBook
(
	id int NOT NULL AUTO_INCREMENT,
	uid varchar(255),
	userId int,
	bookId int,
	PRIMARY KEY (ID)
);






