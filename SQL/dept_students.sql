create table dept_students(studId int, studName varchar(20), age int, gender varchar(10), deptId int, PRIMARY KEY(studId), FOREIGN KEY(deptId) REFERENCES college_dept(deptId));
insert into dept_students values(101,"Sachin",21,"Male",10);
insert into dept_students values(102,"Rashi",20,"Female",10);
insert into dept_students values(103,"Virat",21,"Male",11);
insert into dept_students values(104,"Priya",22,"Female",11);

insert into dept_students values(201,"Ronaldo",42,"Male",20); 
insert into dept_students values(202,"Messi",40,"Male",20); 
insert into dept_students values(203,"Martha",42,"Female",21); 
insert into dept_students values(204,"Neymar",40,"Male",21); 

select * from dept_students;