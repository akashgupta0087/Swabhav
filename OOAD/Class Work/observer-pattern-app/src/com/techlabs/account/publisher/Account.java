package com.techlabs.account.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private List<Listener> listeners;

	public Account(String accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		listeners = new ArrayList<Listener>();
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
		notifyListensers();
	}

	public void withdraw(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
			notifyListensers();
		}
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	private void notifyListensers() {
		for(Listener listener:listeners) {
			listener.update(this);
		}
	}

}
