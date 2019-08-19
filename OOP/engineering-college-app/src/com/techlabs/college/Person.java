package com.techlabs.college;

public abstract class Person {
	protected final int TWELVE_MONTHS = 12;
	protected int id;
	protected String address;
	protected String dob;

	public Person(int id, String address, String dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

}
