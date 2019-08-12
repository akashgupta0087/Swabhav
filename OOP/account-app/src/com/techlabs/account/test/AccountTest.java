package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {

		Account acc = new Account(1001, "Sachin", 1000);
		acc.deposit(2000);
		display(acc);
		acc.withdraw(500);
		display(acc);
		acc.withdraw(500);
		display(acc);

		System.out.println("Balance : " + acc.getBalance());
		acc.deposit(2000);
		System.out.println("Balance : " + acc.getBalance());
		
		System.out.println(acc);
		System.out.println(acc.toString());
	}

	public static void display(Account acc) {
		System.out.println("Account Number: " + acc.getAccountNumber() + "  Name: " + acc.getName() + "  Balance: "
				+ acc.getBalance());
	}
}