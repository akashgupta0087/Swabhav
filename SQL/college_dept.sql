create table College_Dept(deptId int, deptName varchar(50), collegeId int, PRIMARY KEY (deptId), FOREIGN KEY (collegeId) REFERENCES College(collegeId));
insert into college_dept values(10,"Computer",1);
insert into college_dept values(11,"EXTC",1);
insert into college_dept values(20,"Computer",2); 
insert into college_dept values(21,"IT",2);

select * from college_dept