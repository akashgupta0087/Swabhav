create table BankMaster(accName varchar(20), accPassword varchar(20), balance float CHECK (bakance >=500) , PRIMARY KEY(accName));
insert into BankMaster values("Sachin", "sachin@123", 1);

select * from bankmaster;