create table BankTransaction(accName varchar(20), amount float, transactionType varchar(20), transactionDate date, FOREIGN KEY (accName) REFERENCES BankMaster(accName));

Select * from banktransaction;