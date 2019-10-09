package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" +
				        "user=root&password=root");
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("Select * from Students");
			System.out.println("id\t name\t cgpa\t location\t description");
			
			while(result.next()) {
				System.out.println(result.getInt("id")+"\t "+ result.getString("name")+"\t "
						+result.getFloat("cgpa")+"\t "+result.getString("location")+" \t "+result.getString("description"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
