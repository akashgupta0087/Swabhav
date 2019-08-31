package com.techlabs.account.listener;

import com.techlabs.account.publisher.Account;
import com.techlabs.account.publisher.Listener;

public class SMSListener implements Listener {

	@Override
	public void update(Account account) {
		System.out.println("Sending SMS account status changed of account number: " + account.getAccountNumber());
	}

}
