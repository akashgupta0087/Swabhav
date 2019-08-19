package com.techlabs.college;

public class Professor extends Person implements SalariedEmployee {

	private double basicSalary;
	
	public Professor(int id, String address, String dob,double basicSalary) {
		super(id, address, dob);
		this.basicSalary = basicSalary;
		
	}

	@Override
	public double calSalary() {
		return basicSalary * TWELVE_MONTHS;
	}

}
