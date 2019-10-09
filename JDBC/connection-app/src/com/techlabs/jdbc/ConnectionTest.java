package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" +
			        "user=root&password=root");
			DatabaseMetaData metadata = conn.getMetaData();
			
			System.out.println(conn.getClass().getName());
			
			System.out.println("Connection to the database is established : \nUser: " + metadata.getUserName()
			                     + "\nDataBase: "+ metadata.getDatabaseProductName());
//			                     + "\nTimecount: "+ conn.getNetworkTimeout());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
