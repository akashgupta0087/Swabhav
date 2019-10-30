package com.techlabs.repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.techlabs.model.Account;
import com.techlabs.model.TransactionLog;

@Repository
public class BankRepository {
	
	private Connection connection;
	private PreparedStatement preparedStmt;
	
	
	private Session session;
	
	@Autowired
	private SessionFactory factory;
	
	private BankRepository() {
		 System.out.println("Inside Bank Repository");
	}
	
	public void addAccount(String name, String password, float balance) throws HibernateException {
			
			Account acc = new Account();
			acc.setAccName(name);
			acc.setAccPassword(password);
			acc.setBalance(balance);
			
			TransactionLog txnLog = new TransactionLog();
			
			txnLog.setAcc(acc);
			txnLog.setAmount(balance);
			txnLog.setTransactionType("Deposit");
			txnLog.setTransactionDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
						
			Set<TransactionLog> transactions = new HashSet<TransactionLog>();
			
			transactions.add(txnLog);
			
			session = factory.openSession();
			Transaction txn = session.beginTransaction();
			
			acc.setTransactions(transactions);
			session.save(acc);
			
			txn.commit();
			session.close();
			
	}
	
	public String getPassword(String accName){
		
		session = factory.openSession();
		Account acc = (Account) session.createCriteria(Account.class).add(Restrictions.eq("accName", accName)).uniqueResult();
		session.close();
		System.out.println(acc.getAccPassword());
		return acc.getAccPassword();
	}
	
	
	public float getBalance(String accName) {
		
		session = factory.openSession();
		Account acc = (Account) session.createCriteria(Account.class).add(Restrictions.eq("accName", accName)).uniqueResult();
		session.close();
		
		return acc.getBalance();
	}
	
	public void deposit(String accName, float amount) throws SQLException {
		
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Account acc = (Account) session.createCriteria(Account.class).add(Restrictions.eq("accName", accName)).uniqueResult();
		
		TransactionLog txnLog = new TransactionLog();
		txnLog.setAcc(acc);
		txnLog.setAmount(amount);
		txnLog.setTransactionType("Deposit");
		txnLog.setTransactionDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
		session.save(txnLog);
		
		acc.setBalance(acc.getBalance() + amount);
		session.update(acc);
		
		txn.commit();
		session.close();
	
	}
	
	public void withdraw(String accName, float amount) throws SQLException {
		
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Account acc = (Account) session.createCriteria(Account.class).add(Restrictions.eq("accName", accName)).uniqueResult();
		
		TransactionLog txnLog = new TransactionLog();
		txnLog.setAcc(acc);
		txnLog.setAmount(amount);
		txnLog.setTransactionType("Withdraw");
		txnLog.setTransactionDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
		session.save(txnLog);
		
		acc.setBalance(acc.getBalance() - amount);
		session.update(acc);
		
		txn.commit();
		session.close();
	}
	
	public List<TransactionLog> getTransactions(String accName){
		
		session = factory.openSession();
		
		Account acc = (Account) session.createCriteria(Account.class).add(Restrictions.eq("accName", accName)).uniqueResult();
		
		List<TransactionLog> transactions =  session.createCriteria(TransactionLog.class).add(Restrictions.eq("acc",acc)).list();
		
		session.close();
			
		return transactions;
	}
	
	public boolean isUsernameTaken(String accName){
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Account acc = (Account) session.createCriteria(Account.class).add(Restrictions.eq("accName", accName)).uniqueResult();
		txn.commit();
		session.close();
		
		if(acc != null)
			return true;
		return false;
		
	}
}

