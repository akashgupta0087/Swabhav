package com.techlabs.repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	
	public void addAccount(String name, String password, float balance) throws SQLException {
			
			Account acc = new Account();
			acc.setAccName(name);
			acc.setAccPassword(password);
			acc.setBalance(balance);
			
			session = factory.openSession();
			Transaction txn = session.beginTransaction();
			
			session.save(acc);
			txn.commit();
			session.close();
			
//			System.out.println("Transaction Failed");
//			System.out.println(e.getMessage());

	}
	
	public String getPassword(String accName){
		String password = "";
		try {
			preparedStmt = connection.prepareStatement("Select accPassword from BankMaster where accName=?");
			preparedStmt.setString(1, accName);
			ResultSet resultSet = preparedStmt.executeQuery();
			
			while(resultSet.next()) {
				password = resultSet.getString("accPassword");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return password;
	}
	
	
	public float getBalance(String accName) {
		float balance = 0.0f;
		
		try {
			preparedStmt = connection.prepareStatement("Select balance from BankMaster where accName=?");
			preparedStmt.setString(1, accName);
			ResultSet resultSet = preparedStmt.executeQuery();
			
			while(resultSet.next()) {
				balance = resultSet.getFloat("balance");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return balance;
	}
	
	public void deposit(String accName, float amount) throws SQLException {
		connection.setAutoCommit(false);
		
		preparedStmt=connection.prepareStatement("Insert into BankTransaction values(?,?,?,?)");
		preparedStmt.setString(1, accName);
		preparedStmt.setFloat(2,amount);
		preparedStmt.setString(3, "Deposit");
		preparedStmt.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
		preparedStmt.executeUpdate();
		
		preparedStmt = connection.prepareStatement("Update BankMaster set balance=balance+? where accName=?");
		preparedStmt.setFloat(1,amount);
		preparedStmt.setString(2, accName);
		preparedStmt.executeUpdate();
		
		System.out.println("Success");
		connection.commit();
	}
	
	public void withdraw(String accName, float amount) throws SQLException {
       connection.setAutoCommit(false);
		
		preparedStmt=connection.prepareStatement("Insert into BankTransaction values(?,?,?,?)");
		preparedStmt.setString(1, accName);
		preparedStmt.setFloat(2,amount);
		preparedStmt.setString(3, "Withdraw");
		preparedStmt.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
		preparedStmt.executeUpdate();
		
		preparedStmt = connection.prepareStatement("Update BankMaster set balance=balance-? where accName=?");
		preparedStmt.setFloat(1,amount);
		preparedStmt.setString(2, accName);
		preparedStmt.executeUpdate();
		
		System.out.println("Success");
		connection.commit();
	}
	
	public List<TransactionLog> getTransactions(String accName){
		List<TransactionLog> transactions = new ArrayList<TransactionLog>();
		
		try {
			preparedStmt = connection.prepareStatement("Select * from BankTransaction where accName=?");
			preparedStmt.setString(1, accName);
			ResultSet resultSet = preparedStmt.executeQuery();
			
			while(resultSet.next()) {
				transactions.add(new TransactionLog(resultSet.getString("accName"), resultSet.getFloat("amount"), resultSet.getString("transactionType"), resultSet.getDate("transactionDate")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return transactions;
	}
	
}

