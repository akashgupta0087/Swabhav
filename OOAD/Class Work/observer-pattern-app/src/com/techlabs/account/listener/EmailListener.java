package com.techlabs.account.listener;

import com.techlabs.account.publisher.Account;
import com.techlabs.account.publisher.Listener;

public class EmailListener implements Listener {

	@Override
	public void update(Account account) {
		System.out.println("Sending email Account status changed of account number: " + account.getAccountNumber());
	}

}
