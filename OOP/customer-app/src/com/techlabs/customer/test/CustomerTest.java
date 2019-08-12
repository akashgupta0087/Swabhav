package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {
	public static void main(String[] args) {

		Customer c1 = new Customer("Sachin", "Tendulkar");
		System.out.println(c1.getId());

		Customer c2 = new Customer("M.S.", "Dhoni");
		System.out.println(c2.getId());

		Customer c3 = new Customer("Virat", "Kholi");
		System.out.println(c3.getId());

		System.out.println(c1.getId());
	}
}