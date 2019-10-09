package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementTest {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Scanner sc = new Scanner(System.in);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/aurionpro?" + "user=root&password=root");
			
			System.out.print("Enter an id : ");
			String id = sc.nextLine();
			sc.close();
			
			PreparedStatement preparedStatement = conn.prepareStatement("Select * from Students where id=?");
			preparedStatement.setString(1, id);
			ResultSet result = preparedStatement.executeQuery();
			
			System.out.println("id\t name\t cgpa\t location\t description");
			
			while (result.next()) {
				System.out.println(
						result.getInt("id") + "\t " + result.getString("name") + "\t " + result.getFloat("cgpa") + "\t "
								+ result.getString("location") + "\t " + result.getString("description"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
