INSERT INTO student (student_id, student_name, student_password, student_phone)
VALUES (12330129, 'hjl', 12330129, 664276),
       (12330128, 'hjx', 12330128, 18923215788),
       (12330095, 'ghc', 12330095, 654331),
       (12330111, 'hrq', 12330111, 13824401914),
       (12330117, 'hys', 12330117, 665397),
       (12330131, 'hlk', 12330131, 668102);

INSERT INTO organizer (organizer_name, organizer_password, organizer_phone)
VALUES ('class_dmt', 123, 12345678),
       ('class3', 123, 87654321);

INSERT INTO activity (activity_name, organizer_name)
VALUES ('class_study', 'class_dmt'),
       ('courses_review', 'class_dmt'),
       ('class_party', 'class_dmt'),
       ('class_party', 'class3');

INSERT INTO activity
(activity_name, organizer_name, activity_time, activity_place, activity_discript)
VALUES
('class travelling', 'class3', '2016-06-14', 'America', 'The whole class travel to America'),
('class film', 'class3', 'xxxx-xx-xx', '', 'The whole class watch movie together');

INSERT INTO student_activity (activity_id, student_id)
VALUES (1, 12330129),
       (1, 12330128),
       (1, 12330095),
       (1, 12330111),
       (1, 12330117),
       (4, 12330131),
       (4, 42330429),
       (4, 42330428),
       (4, 42330095),
       (4, 42330444),
       (4, 42330447);
