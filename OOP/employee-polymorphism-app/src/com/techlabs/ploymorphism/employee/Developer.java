package com.techlabs.ploymorphism.employee;

public class Developer extends Employee {

	private final double PA = 0.4 * basicSalary;
	private final double TA = 0.3 * basicSalary;
	
	public Developer(int empNumber, String empName, double basicSalary) {
		super(empNumber, empName, basicSalary);
	}

	@Override
	public double calCTC() {
		double totalSalary = (PA + TA + basicSalary) * TWELVEMONTHS;
		return totalSalary;
	}
	
	public String getSalaryDetails() {
		return "TA: " + getTA() + " PA: " + getPA();
	}

	public double getPA() {
		return PA;
	}

	public double getTA() {
		return TA;
	}

	
}
