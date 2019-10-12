create table BankMaster(accName varchar(20), accPassword varchar(20), balance float CHECK (bakance >=500) , PRIMARY KEY(accName));
insert into BankMaster values("Sachin", "sachin@123", 1);
insert into BankMaster values("Dhoni", "dhoni@123", 400);

UPDATE BankMaster
SET balance = balance - 4100
WHERE accName = "Sachin"

select * from bankmaster;

DELIMITER $$ 
CREATE TRIGGER TR_BankMaster_BI BEFORE INSERT ON BankMaster 
FOR EACH ROW 
BEGIN 
if (NEW.balance < 500) 
THEN SIGNAL SQLSTATE '45000' 
SET MESSAGE_TEXT = 'ERROR: Balance should be 500!'; 
END IF; 
END 
$$ DELIMITER; 

DELIMITER $$ 
CREATE TRIGGER TR_BankMaster_BU BEFORE UPDATE ON BankMaster 
FOR EACH ROW 
BEGIN 
if (NEW.balance < 500) 
THEN SIGNAL SQLSTATE '45000' 
SET MESSAGE_TEXT = 'ERROR: Balance should be 500!'; 
END IF; 
END 
$$ DELIMITER;

