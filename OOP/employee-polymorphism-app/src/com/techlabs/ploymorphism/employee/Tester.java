package com.techlabs.ploymorphism.employee;

public class Tester extends Employee {

	private final double bonus = 0.5 * basicSalary;
	
	public Tester(int empNumber, String empName, double basicSalary) {
		super(empNumber, empName, basicSalary);
	}

	@Override
	public double calCTC() {
		double totalSalary = (bonus + basicSalary) * TWELVEMONTHS;
		return totalSalary;
	}
	
	public String getSalaryDetails() {
		return "Bonus: " + getBonus();
	}

	public double getBonus() {
		return bonus;
	}

	
}
