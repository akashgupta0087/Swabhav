package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementFilterTest {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			Scanner sc = new Scanner(System.in);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/aurionpro?" + "user=root&password=root");
			Statement statement = conn.createStatement();

			System.out.print("Enter an id : ");
			String id = sc.nextLine();
			sc.close();
			
			ResultSet result = statement.executeQuery("Select * from Students where id=" + id);

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
