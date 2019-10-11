package com.techlabs.model;

public class Account {
	private String accName;
	private String accPassword;
	private float balance;
	
	public Account(String accName, String accPassword, float balance) {
		this.accName = accName;
		this.accPassword = accPassword;
		this.balance = balance;
	}

	public String getAccName() {
		return accName;
	}

	public String getAccPassword() {
		return accPassword;
	}

	public float getBalance() {
		return balance;
	}
	
}
