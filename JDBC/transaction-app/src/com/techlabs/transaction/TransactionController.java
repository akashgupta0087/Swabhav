package com.techlabs.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionController {
	
	Connection connection;
	PreparedStatement preparedStmt;
	
	public TransactionController() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void transfer(int amount) {
		try {
		connection.setAutoCommit(false);
		preparedStmt=connection.prepareStatement("Update Customer set balance=balance-? where id=101");
		preparedStmt.setInt(1, amount);
		preparedStmt.executeUpdate();
		preparedStmt=connection.prepareStatement("Update Merchant set balance= balance+? where id=201");
		preparedStmt.setInt(1, amount);
		preparedStmt.executeUpdate();
		System.out.println("Success");
		connection.commit();
		
		} catch (SQLException e) {
		System.out.println("Transaction Failed");
//		e.printStackTrace();
		}

		}

}
