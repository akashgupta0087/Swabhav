package com.techlabs.account.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class AccountTestSerialization {
	public static void main(String[] args) {

		Account acc = new Account(1001, "Sachin", 1000);

		// acc.deposit(2000);

		serialize(acc);

		acc.deposit(2000);

		deserialize(acc);

	}

	public static void serialize(Account acc) {

		try {
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("resources/balance.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(acc);
			System.out.println("Serialization Done");

			out.flush();
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deserialize(Account acc) {
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("resources/balance.txt"));
			acc = (Account) in.readObject();

			System.out.println("Deserialization Done");
			System.out.println("Balance : " + acc.getBalance());

			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}