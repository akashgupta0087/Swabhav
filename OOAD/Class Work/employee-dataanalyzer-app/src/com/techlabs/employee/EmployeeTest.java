package com.techlabs.employee;

public class EmployeeTest {
	public static void main(String[] args) {

		Employees employees = new Employees("https://swabhav-tech.firebaseapp.com/emp.txt");

		for (Employee employee : employees.getEmpList()) {
			System.out.println("Id:" + employee.getId() + " Name:" + employee.getName() + " Designation:"
					+ employee.getDesignation() + " ManagerID:" + employee.getManagerId() + " DOJ:" + employee.getDoj()
					+ " Salary:" + employee.getSalary() + " Commssion:" + employee.getCommmission() + " DeptNo.:"
					+ employee.getDeptNumber());
		}
		
		System.out.println("\nTotal employees: " + employees.getEmpList().size());
		System.out.println("\nMaximum salaried employee: ");
		display(employees.findMaxSalariedEmployee());
		System.out.println("\nNumber of employees by designation: " + employees.findEmployeesByDesgination("MANAGER"));
		System.out.println("\nNumber of employees by Department Number: "+ employees.findEmployeesByDeptNo(30));
		
	}
	
	
	private static void display(Employee employee) {
		System.out.println("Id:" + employee.getId() + " Name:" + employee.getName() + " Designation:"
				+ employee.getDesignation() + " ManagerID:" + employee.getManagerId() + " DOJ:" + employee.getDoj()
				+ " Salary:" + employee.getSalary() + " Commssion:" + employee.getCommmission() + " DeptNo.:"
				+ employee.getDeptNumber());
		
	}

}















