package com.techlabs.crud;

public class AddressDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Address created");
		
	}

	@Override
	public void read() {
		System.out.println("Reading address");		
	}

	@Override
	public void update() {
		System.out.println("Updating address");		
	}

	@Override
	public void delete() {
		System.out.println("Deleting address");		
	}
	

}
