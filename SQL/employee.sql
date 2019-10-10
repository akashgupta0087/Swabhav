create table Employee(empNo int, empName varchar(20), salary float, deptNo int, PRIMARY KEY(empNo), FOREIGN KEY(deptNo) REFERENCES Department(DeptNo));
insert into employee values(101, "Sachin", 30000, 10);
insert into employee values(102, "Virat", 20000, 10);
insert into employee values(103, "Dhoni", 35000, 11);
insert into employee values(104, "Hardhik", 25000, 11);
insert into employee values(105, "Rahul", 20000, 12);
insert into employee values(106, "Rohit", 15000, 12);
insert into employee values(107, "Shikar", 20000, 15);

insert into employee values (201,"Ronaldo",20000,20); 
insert into employee values (202,"Messi",21000,20); 
insert into employee values (203,"Neymar",23000,20); 
insert into employee values (204,"Ronaldino",30000,21); 
insert into employee values (205,"Pogba",34000,21); 
insert into employee values (206,"Drogba",29000,22); 
insert into employee values (207,"Torres",25000,22); 


Select * from employee
