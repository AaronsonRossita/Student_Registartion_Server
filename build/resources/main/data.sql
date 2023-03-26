DROP TABLE IF EXISTS course;
DROP TABLE IF EXISTS student;

CREATE TABLE course (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    name varchar(300) NOT NULL DEFAULT '',
    start_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE student (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    course_id int(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (course_id) REFERENCES course(id)
);

INSERT INTO course (name, start_date) VALUES
('fullstack', '2023-07-14'),
('qa', '2023-02-20'),
('cyber', '2023-04-05'),
('product management', '2023-06-30');
