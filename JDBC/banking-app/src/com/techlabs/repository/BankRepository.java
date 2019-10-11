package com.techlabs.repository;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.techlabs.model.Account;

public class BankRepository {
	
	private Connection connection;
	private PreparedStatement preparedStmt;
	private static BankRepository bankRepo = null;
	
	private BankRepository() {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		
		 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static BankRepository getInstance() {
		if(bankRepo == null)
			bankRepo = new BankRepository();
		
		return bankRepo;
	}
	
	public void addAccount(Account account) {
		
		try {
			
			connection.setAutoCommit(false);
			
			preparedStmt=connection.prepareStatement("Insert into BankMaster values(?,?,?)");
			preparedStmt.setString(1, account.getAccName());
			preparedStmt.setString(2, account.getAccPassword());
			preparedStmt.setFloat(3,account.getBalance());
			preparedStmt.executeUpdate();
			
			preparedStmt=connection.prepareStatement("Insert into BankTransaction values(?,?,?,?)");
			preparedStmt.setString(1, account.getAccName());
			preparedStmt.setFloat(2,account.getBalance());
			preparedStmt.setString(3, "Deposit");
			preparedStmt.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
			preparedStmt.executeUpdate();
			
			System.out.println("Success");
			connection.commit();
			
			} catch (SQLException e) {
			System.out.println("Transaction Failed");
//			e.printStackTrace();
			}

	}
	
	
	
	

}
