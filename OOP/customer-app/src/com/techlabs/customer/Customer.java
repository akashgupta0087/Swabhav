package com.techlabs.customer;

public class Customer {
	private static int customerCount;
	private int id;
	private String firstName;
	private String lastName;

	static {
		customerCount = 100;
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		customerCount += 1;
		id = customerCount;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}