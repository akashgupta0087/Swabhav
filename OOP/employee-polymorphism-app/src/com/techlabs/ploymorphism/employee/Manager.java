package com.techlabs.ploymorphism.employee;

public class Manager extends Employee {

	private final double HRA = 0.5 * basicSalary;
	private final double TA = 0.5 * basicSalary;
	private final double bonus = 0.5 * basicSalary;
	
	public Manager(int empNumber, String empName, double basicSalary) {
		super(empNumber, empName, basicSalary);
	}

	@Override
	public double calCTC() {
		double totalSalary = (HRA + TA + bonus + basicSalary) * TWELVEMONTHS;
		return totalSalary;
	}
	
	public String getSalaryDetails() {
		return "HRA: " + getHRA() + " TA: " + getTA() + " Bonus: " + getBonus();
	}

	public double getHRA() {
		return HRA;
	}

	public double getTA() {
		return TA;
	}

	public double getBonus() {
		return bonus;
	}

	
}
