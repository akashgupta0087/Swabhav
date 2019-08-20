package com.techlabs.account;

public class InsufficientFundsException extends RuntimeException {
	
	private Account account;
	private double amount;
	
	public InsufficientFundsException(Account account,double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public String getMessage() {
		return account.getName() + " a"
				+ "fter withdrawing " + amount + " your balance will be "
				+ "less than 500 which will violate our bank's policy";
	}

}
