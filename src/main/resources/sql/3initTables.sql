INSERT INTO student (student_id, student_name, student_password)
VALUES (12330129, 'hjl', 12330129),
      (12330128, 'hjx', 12330128),
      (12330095, 'ghc', 12330095),
      (12330111, 'hrq', 12330111),
      (12330117, 'hys', 12330117);

INSERT INTO organizer (organizer_name, organizer_password)
VALUES ('class_dmt', 123),
       ('class3', 123);

INSERT INTO activity (activity_name, organizer_name)
VALUES ('class_party', 'class3');

INSERT INTO student_activity (activity_id, student_id)
VALUES (1, 12330129),
       (1, 12330128),
       (1, 12330095),
       (1, 12330111),
       (1, 12330117);