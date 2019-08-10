package com.techlabs.account;

public class Account {
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

	public void withdraw(double amount) {
		if (balance - amount >= 500) {
			balance = balance - amount;
		}
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