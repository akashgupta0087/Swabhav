package com.techlabs.polymorphism.employee.test;

import com.techlabs.ploymorphism.employee.*;

public class EmployeeTest {
	public static void main(String[] args) {

		Manager manager = new Manager(10001, "Sachin", 20000);
		printSalarySlip(manager);
		
		Developer dev = new Developer(20001, "Dhoni", 15000);
		printSalarySlip(dev);
		
		Tester test = new Tester(30001, "Kholi", 10000);
		printSalarySlip(test);
	}

	public static void printSalarySlip(Employee emp) {
		System.out.println("Employee Number: " + emp.getEmpNumber() + " Name: " + emp.getEmpName()
				+ " Basic Salary: " + emp.getBasicSalary() + " CTC: " + emp.calCTC() + "\nSalary Details: " + emp.getSalaryDetails());
	}

}
