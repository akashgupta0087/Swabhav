package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable {
	private final int accountNumber;
	private final String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNumber, String name) {
		this(accountNumber, name, 500);
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public String withdraw(double amount) {
		if (balance - amount >= 500) {
			balance = balance - amount;
			return "Amount withdrawn successfully";
		}
		throw new RuntimeException("Balance should be 500");
	}

	public String toString() {
		String superclass = super.toString();
		return "Account No. : " + getAccountNumber() + " Name : " + getName() + 
				" Balance : " + getBalance() + " Pervious Code : " + superclass;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account acc = (Account)obj;
		return(accountNumber == acc.accountNumber);
	}
	
	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
}