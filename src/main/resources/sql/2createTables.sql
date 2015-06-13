USE test;

CREATE TABLE student(
  student_id varchar(8) not null,
  student_name varchar(45) not null,
  student_password varchar(20) not null,
  primary key(student_id)
)engine=InnoDB;

CREATE TABLE organizer(
  organizer_id int(8) not null auto_increment,
  organizer_name varchar(45) not null,
  organizer_password varchar(20) not null,
  primary key(organizer_id)
)engine=InnoDB;

CREATE TABLE activity(
  activity_id int(8) not null auto_increment,
  activity_name varchar(45) not null,
  organizer_name varchar(45) not null,
  primary key(activity_id)
)engine=InnoDB;

CREATE TABLE student_activity(
  activity_id int(8) not null,
  student_id varchar(8) not null,
  primary key(activity_id, student_id)
)engine=InnoDB;