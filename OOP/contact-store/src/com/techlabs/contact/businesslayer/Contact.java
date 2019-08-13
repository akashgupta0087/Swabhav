package com.techlabs.contact.businesslayer;

import java.util.ArrayList;
import java.io.Serializable;

public class Contact implements Serializable{
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;

	public Contact(String firstName, String lastName, String email, String phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
}
