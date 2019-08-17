package com.techlabs.crud.test;

import com.techlabs.crud.*;

public class TestCrud {
	public static void main(String[] args) {
		InvoiceDB invoice = new InvoiceDB();
		doDBOperations(invoice);
		
		CustomerDB customer = new CustomerDB();
		doDBOperations(customer);
		
		AddressDB address = new AddressDB();
		doDBOperations(address);
	}

	public static void doDBOperations(ICrudable ic) {
		System.out.println("Doing DB operations");
		ic.create();
		ic.read();
		ic.update();
		ic.delete();
		System.out.println(" ");
	}
}
