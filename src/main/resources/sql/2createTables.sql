USE test;

DROP TABLE if EXISTS student;
CREATE TABLE student(
  student_id varchar(8) not null,
  student_name varchar(45) not null,
  student_password varchar(20) not null,
  student_phone varchar(11),
  primary key(student_id)
)engine=InnoDB;

DROP TABLE if EXISTS organizer;
CREATE TABLE organizer(
  organizer_id int(8) not null auto_increment,
  organizer_name varchar(45) not null,
  organizer_password varchar(20) not null,
  organizer_phone varchar(11),
  primary key(organizer_id)
)engine=InnoDB;


DROP TABLE if EXISTS activity;
CREATE TABLE activity(
  activity_id int(8) not null auto_increment,
  activity_name varchar(45) not null,
  organizer_name varchar(45) not null,
  activity_time varchar(50),
  activity_place varchar(50),
  activity_discript varchar(500),
  activity_isPost bool not null DEFAULT TRUE,
  primary key(activity_id)
)engine=InnoDB;

DROP TABLE if EXISTS student_activity;
CREATE TABLE student_activity(
  activity_id int(8) not null,
  student_id varchar(8) not null,
  primary key(activity_id, student_id)
)engine=InnoDB;