package com.techlabs.crud;

public class InvoiceDB implements ICrudable {
	
	public void create() {
		System.out.println("Invoice created");
	}
	
	public void read() {
		System.out.println("Reading Invoice");
	}

	@Override
	public void update() {
		System.out.println("Updating invoice");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting invoive");
	}

}
