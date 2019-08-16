package com.techlabs.account.polymorphism.test;

import com.techlabs.account.polymorphism.*;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(1000001, "Sachin", 10000);
		printStatement(saving);
		saving.deposit(5000);
		printStatement(saving);
		saving.withdraw(14600);
		printStatement(saving);

		CurrentAccount current = new CurrentAccount(5000001, "Ronaldo", 10000);
		printStatement(current);
		current.deposit(5000);
		printStatement(current);
		current.withdraw(14000);
		printStatement(current);
		current.withdraw(5000);
		printStatement(current);
	}

	public static void printStatement(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber() + " Name: " + account.getName()
				+ " Balance: " + account.getBalance());
	}
}
