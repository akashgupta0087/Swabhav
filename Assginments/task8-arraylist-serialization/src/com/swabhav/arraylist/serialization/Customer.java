package com.swabhav.arraylist.serialization;

import java.io.Serializable;

public class Customer implements Serializable{
	
		private static int customerCount;
		public int id;
		private String firstName;
		private String lastName;

		static {
			customerCount = 100;
		}

		public Customer(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			customerCount += 1;
			id = customerCount;
		}

		public int getId() {
			return id;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
}
