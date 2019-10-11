package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactRepository {
	
	private Connection connection = null;
	private PreparedStatement preparedStmt = null;
	
	public ContactRepository() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addContact(Contact contact) {
		try {
			preparedStmt = connection.prepareStatement("Insert into Contacts values(?,?,?,?)");
			preparedStmt.setString(1, contact.getPhoneNo());
			preparedStmt.setString(2, contact.getFirstName());
			preparedStmt.setString(3, contact.getLastName());
			preparedStmt.setString(4, contact.getEmail());

			preparedStmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Contact> getContacts(){
		List<Contact> contacts = new ArrayList<Contact>();
		try {
			preparedStmt = connection.prepareStatement("Select * from Contacts");
			ResultSet resultSet = preparedStmt.executeQuery();
			
			while(resultSet.next()) {
				contacts.add(new Contact(resultSet.getString("FirstName"),resultSet.getString("LastName"),resultSet.getString("Email"),resultSet.getString("PhoneNumber")));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contacts;
	}

}
