package com.techlabs.account.polymorphism;

public class CurrentAccount extends Account {

	private final int OVERDRAFT = -5000;
	
	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}
	
	public void withdraw(double amount) {
		if(balance - amount >= OVERDRAFT) {
		balance = balance - amount;
		}
		else
			System.out.println("You can overdraft only upto 5000");
	}

}
