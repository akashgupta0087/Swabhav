package com.techlabs.account.polymorphism;

public class SavingAccount extends Account {

	public final int MIN_BALANCE = 500;

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance = balance - amount;
		} else
			System.out.println("After withdrawing your minimum balance should be 500");
	}
}
