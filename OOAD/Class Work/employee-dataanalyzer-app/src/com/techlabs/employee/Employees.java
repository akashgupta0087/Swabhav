package com.techlabs.employee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Employees {
	private LinkedHashSet<Employee> empList = new LinkedHashSet<Employee>();
	EmployeeDataLoader loader;
	
	public Employees(String path) {
		loader = new EmployeeDataLoader();
		//empList = loader.loadEmpDetails(path);
		empList = loader.loadEmpDetailsFromWeb(path);
	}

	public HashSet<Employee> getEmpList() {
		return empList;
	}

	public EmployeeDataLoader getLoader() {
		return loader;
	}
	
	public Employee findMaxSalariedEmployee() {
		double maxSalary = 0;
		Employee employee = null;
		for(Employee emp:empList) {
			maxSalary = Math.max(maxSalary,emp.getSalary());
		}
		
		for(Employee emp:empList) {
			if(maxSalary == emp.getSalary()) {
				employee = emp;
				break;
			}
		}
		return employee;
	}
	
	public int findEmployeesByDesgination(String designation) {
		int countOfEmployees = 0;
		for(Employee emp:empList) {
			if(designation.equalsIgnoreCase(emp.getDesignation())) {
				countOfEmployees+=1;
			}
		}
		return countOfEmployees;
	}
	
	public int findEmployeesByDeptNo(int deptNo) {
		int countOfEmployees = 0;
		for(Employee emp: empList) {
			if(emp.getDeptNumber() == deptNo)
				countOfEmployees+=1;
		}
		return countOfEmployees;
	}

	
	
	
	
	
	
	
	

}
