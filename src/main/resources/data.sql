insert into passport(id,number) values(4001,'E1234');
insert into passport(id,number) values(4002,'F1235');
insert into passport(id,number) values(4003,'G1236');

insert into student(id,name, passport_id) values(2001,'Ashima',4001);
insert into student(id,name, passport_id) values(2002,'John',4002);
insert into student(id,name, passport_id) values(2003,'Michael',4003);

insert into course(id,name) values(1001, 'Java');
insert into course(id,name) values(1002, 'Python');
insert into course(id,name) values(1003, 'NodeJs');

insert into review(id,rating,description, course_id) values(5001,'5', 'Awesome course', 1001);
insert into review(id,rating,description, course_id) values(5003,'4', 'Good course',1001);
insert into review(id,rating,description, course_id) values(5004,'3', 'Ok course',1003);


