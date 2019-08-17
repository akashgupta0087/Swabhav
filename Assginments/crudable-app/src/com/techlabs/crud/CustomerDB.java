package com.techlabs.crud;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Customer created");
	}

	@Override
	public void read() {
		System.out.println("Reading customer");
	}

	@Override
	public void update() {
		System.out.println("Updating customer");
	}

	@Override
	public void delete() {
		System.out.println("Deleting customer");
	}

}
