package com.techlabs.ploymorphism.employee;

public abstract class Employee {

	protected final int TWELVEMONTHS = 12;
	
	private int empNumber;
	private String empName;
	protected double basicSalary;
	
	public Employee(int empNumber, String empName, double basicSalary) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	
	
	public abstract double calCTC();
	
	public abstract String getSalaryDetails();

	public int getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	
	
	
	

}
