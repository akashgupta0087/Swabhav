package com.techlabs.contact.servicelayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.contact.businesslayer.Contact;

public class ContactService {
	private Connection connection = null;
	private  PreparedStatement preparedStmt = null;

	public ContactService() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (SQLException e) {
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

	public List<Contact> getContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		try {
			preparedStmt = connection.prepareStatement("Select * from Contacts");
			ResultSet resultSet = preparedStmt.executeQuery();
//			if (!resultSet.next()) {
//				System.out.println("No contacts to display");
//			} else {
//				resultSet.beforeFirst();
//				System.out.println("FirstName\t LastName\t Email\t\t\t\t PhoneNumber");
//				while (resultSet.next()) {
//					System.out.println(resultSet.getString("FirstName") + "\t\t " + resultSet.getString("LastName")
//							+ "\t\t " + resultSet.getString("Email") + "\t " + resultSet.getString("PhoneNumber"));
//				}
//			}
			
			while(resultSet.next()) {
				contacts.add(new Contact(resultSet.getString("FirstName"),resultSet.getString("LastName"),resultSet.getString("Email"),resultSet.getString("PhoneNumber")));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contacts;
	}
	
	public List<Contact> searchContacts(String firstName) {
		List<Contact> searchedContacts = new ArrayList<Contact>();
		try {
			preparedStmt = connection.prepareStatement("Select * from Contacts where FirstName=?");
			preparedStmt.setString(1, firstName);
			ResultSet resultSet = preparedStmt.executeQuery();
//			if (!resultSet.next()) {
//				System.out.println("No contact name found with first name '"+ firstName +"'");
//			} else {
//				resultSet.beforeFirst();
//				System.out.println("FirstName\t LastName\t Email\t\t\t\t PhoneNumber");
//				while (resultSet.next()) {
//					System.out.println(resultSet.getString("FirstName") + "\t\t " + resultSet.getString("LastName")
//							+ "\t\t " + resultSet.getString("Email") + "\t " + resultSet.getString("PhoneNumber"));
//				}
			while(resultSet.next()) {
				searchedContacts.add(new Contact(resultSet.getString("FirstName"),resultSet.getString("LastName"),resultSet.getString("Email"),resultSet.getString("PhoneNumber")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return searchedContacts;
	}

}
