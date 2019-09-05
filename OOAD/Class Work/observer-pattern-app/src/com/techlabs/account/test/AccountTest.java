package com.techlabs.account.test;

import com.techlabs.account.listener.EmailListener;
import com.techlabs.account.listener.SMSListener;
import com.techlabs.account.publisher.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("101","Sachin",5000);
		SMSListener sms = new SMSListener();
		EmailListener email = new EmailListener();
		
		account1.addListener(sms);
		account1.addListener(email);
		
		account1.deposit(1000);
		account1.withdraw(500);
	}

}
