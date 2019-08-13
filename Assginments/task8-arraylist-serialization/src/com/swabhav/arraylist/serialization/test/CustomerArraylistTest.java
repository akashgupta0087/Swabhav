package com.swabhav.arraylist.serialization.test;

import java.util.*;
import java.io.*;
import com.swabhav.arraylist.serialization.Customer;

public class CustomerArraylistTest {
	public static void main(String[] args) {

		ArrayList customerList = new ArrayList();

		customerList.add(new Customer("Sachin", "Tendulkar"));

		customerList.add(new Customer("M.S.", "Dhoni"));

		customerList.add(new Customer("Virat", "Kholi"));

		customerList.add(new Customer("Rishab", "Panth"));

//		customerList.add(10);
//		customerList.add(20);

		serialize(customerList);
		ArrayList customers = deserialize();

//		for (Object o : customers) {
//			System.out.println(o);
//		}

		for(int i = 0; i < customers.size(); i++) {
			Customer c = (Customer) customers.get(i);
			System.out.println(c.getFirstName() + c.getLastName());
		}
	}

	public static void serialize(ArrayList cus) {

		try {
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("resources/serialization.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(cus);
			System.out.println("Serialization Done");

			out.flush();
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static ArrayList deserialize() {
		
		ArrayList customers = null;
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("resources/serialization.txt"));
			customers = (ArrayList) in.readObject();

			System.out.println("Deserialization Done");

			// closing the stream
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
		return customers;

	}
}
