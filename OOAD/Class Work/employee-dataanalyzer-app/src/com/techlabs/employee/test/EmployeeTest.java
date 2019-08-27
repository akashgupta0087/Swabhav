package com.techlabs.employee.test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import com.techlabs.employee.Employee;
import com.techlabs.employee.EmployeeDataAnalyzer;
import com.techlabs.employee.FileLoader;
import com.techlabs.employee.URLFileLoader;

public class EmployeeTest {
	public static void main(String[] args) {
		
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new FileLoader("Resources\\dataFile (1) (1).txt"));
			
		displayEmployees(analyzer.getEmployeeList()); 
		System.out.println(" ");
		displayMaxSalariedEmployee(analyzer.getMaxSalariedEmployee());
		System.out.println(" ");
		displayDesignationWiseEmployees(analyzer.getDesignationWiseEmployees());
		System.out.println(" ");
		displayDeptWiseEmployees(analyzer.getDeptWiseEmployees());

	}

	private static void displayEmployees(LinkedHashSet<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println("Id:" + employee.getId() + " Name:" + employee.getName() + " Designation:"
					+ employee.getDesignation() + " ManagerID:" + employee.getManagerId() + " DOJ:" + employee.getDoj()
					+ " Salary:" + employee.getSalary() + " Commssion:" + employee.getCommmission() + " DeptNo.:"
					+ employee.getDeptNumber());
		}
	}

	private static void displayMaxSalariedEmployee(Employee employee) {
		System.out.println("Id:" + employee.getId() + " Name:" + employee.getName() + " Designation:"
				+ employee.getDesignation() + " ManagerID:" + employee.getManagerId() + " DOJ:" + employee.getDoj()
				+ " Salary:" + employee.getSalary() + " Commssion:" + employee.getCommmission() + " DeptNo.:"
				+ employee.getDeptNumber());
	}

	private static void displayDeptWiseEmployees(HashMap<Integer, Integer> deptWiseEmployees) {
		for (Map.Entry deptWiseEmployee : deptWiseEmployees.entrySet()) {
			System.out.println(deptWiseEmployee.getKey() + ": " + deptWiseEmployee.getValue());
		}
	}
	
	private static void displayDesignationWiseEmployees(HashMap<String, Integer> designationWiseEmployees) {
		for (Map.Entry designationWiseEmployee : designationWiseEmployees.entrySet()) {
			System.out.println(designationWiseEmployee.getKey() + ": " + designationWiseEmployee.getValue());
		}
	}
	
}
