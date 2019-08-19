package com.swabhav.objectcreation.test;

import com.swbhav.objectcreation.Account;

public class Test {
	public static void main(String[] args) {
		Account account1 = new Account(1001,"Sachin");
		
		try {
			Account account2 = (Account) Class.forName("com.swbhav.objectcreation.Account").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Account object = new Account(1002,"Kholi");
		try {
			Account account3 = (Account) object.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
