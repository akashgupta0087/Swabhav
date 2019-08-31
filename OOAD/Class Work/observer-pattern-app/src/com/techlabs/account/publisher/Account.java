package com.techlabs.account.publisher;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;

	public Account(String accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance - amount >= 500)
			balance -= amount;
	}

}
