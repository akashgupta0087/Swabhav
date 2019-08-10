package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {

		Account acc = new Account(1001, "Sachin", 1000);
		acc.deposit(0);
		display(acc);
		acc.withdraw(500);
		display(acc);
		acc.withdraw(500);
		display(acc);
	}

	public static void display(Account acc) {
		System.out.println("Account Number: " + acc.getAccountNumber() + "  Name: " + acc.getName() + "  Balance: "
				+ acc.getBalance());
	}
}