package com.techlabs.account.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.account.Account;

class AccountJUnitTest {
	Account account1 = new Account(101,"Sachin");
	
	Account account2 = new Account(102, "Kholi");
	
	Account account3 = new Account(103, "Dhoni");
	
	Account account4 = new Account(104,"Rahul",1000);
	
	Account account5 = new Account(105, "Rohit",2000);
	
	Account account6 = new Account(106, "Jadeja",3000);

	@Test
	void twoParameterConstructorWillPass() {
		assertEquals(101,account1.getAccountNumber());
		
		assertEquals("Kholi",account2.getName());
		
		assertEquals(500,account3.getBalance());
	}
	
	@Test
	void threeParameterConstructorWillPass() {
		assertEquals(104,account4.getAccountNumber());
		
		assertEquals("Rohit",account5.getName());
		
		assertEquals(3000,account6.getBalance());
	}
	
	@Test
	void testDeposit() {
		account1.deposit(1000);
		assertEquals(1500,account1.getBalance());
		
		account4.deposit(1000);
		assertEquals(2000,account4.getBalance());
	}
	
	@Test
	void testWithdrawWillWorkForBalanceMoreThanFiveHundred() {
		account4.withdraw(500);
		assertEquals(500,account4.getBalance());
		
		account2.deposit(0);
		assertEquals(500,account2.getBalance());
	}
	
	@Test
	void testWithdrawWillNotWorkForBalanceLessThanFiveHundred() {
		try {
		account3.withdraw(500);
		assertEquals(0,account3.getBalance());
		
		account6.withdraw(2600);
		assertEquals(400,account6.getBalance());
	}
		catch(RuntimeException re) {
			
		}
	}

}
