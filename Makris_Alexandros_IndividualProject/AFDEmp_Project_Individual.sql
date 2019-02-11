CREATE DATABASE IF NOT EXISTS `AFDEmp_Project_Individual`;




CREATE TABLE  IF NOT EXISTS `AFDEmp_Project_Individual`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(25) NOT NULL,
  `password` VARCHAR(25) NOT NULL,
  `fname` VARCHAR(45) NOT NULL,
  `lname` VARCHAR(45) NOT NULL,
  `role` ENUM('writer', 'editor', 'admin') NOT NULL,
  `status` ENUM('online', 'offline', 'inactive') NOT NULL DEFAULT 'offline',
  PRIMARY KEY (`id`));

 


CREATE TABLE IF NOT EXISTS `AFDEmp_Project_Individual`.`messages` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date_time` DATETIME NOT NULL,
  `sender_id` INT NOT NULL,
  `receiver_id` INT NOT NULL,
  `title` VARCHAR(70) DEFAULT 'NO TITLE',
  `message` VARCHAR(250) NOT NULL,
  `sender_status` ENUM('unread', 'read', 'deleted') NOT NULL DEFAULT 'read',
  `receiver_status` ENUM('unread', 'read', 'deleted') NOT NULL DEFAULT 'unread',
  `message_status` ENUM('article', 'message') NOT NULL DEFAULT 'message',
  `article_status` ENUM('published', 'unpublished', 'not_submitted') NOT NULL DEFAULT 'not_submitted',
  `publication_time` DATETIME,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`sender_id`) references `AFDEmp_Project_Individual`.`users` (`id`),
  FOREIGN KEY (`receiver_id`) references `AFDEmp_Project_Individual`.`users` (`id`)
  
  );
  
  

  
  
  

