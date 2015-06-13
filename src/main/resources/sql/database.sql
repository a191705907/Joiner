CREATE database test;

CREATE USER 'test'@'localhost';

GRANT ALL PRIVILEGES ON test.* TO 'test'@'localhost' identified BY 'test';
