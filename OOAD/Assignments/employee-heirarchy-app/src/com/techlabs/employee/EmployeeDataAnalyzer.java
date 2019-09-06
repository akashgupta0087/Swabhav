package com.techlabs.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class EmployeeDataAnalyzer {
	private static HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
	private static Employee root;
	ILoadable loader;

	public EmployeeDataAnalyzer(ILoadable loader) {
		this.loader = loader;
		employees = loader.loadData();

	}

	public Employee getRootNode() {
		for (Employee employee : employees.values()) {
			if (employee.getManagerId() == null)
				root = employee;
		}
		return root;
	}

	public void constructHeirarchyTree(Employee localRoot) {
		Employee employee = localRoot;
		List<Employee> subordinates = getSubordinatesById(employee.getId());
		employee.setSubordinates(subordinates);
		if (subordinates.size() == 0)
			return;

		for (Employee emp : subordinates) {
			constructHeirarchyTree(emp);
		}
	}
	
	
	private List<Employee> getSubordinatesById(int reportId) {
		List<Employee> subordinates = new ArrayList<Employee>();
		try {
			for (Employee employee : employees.values()) {
				if (employee.getManagerId() == reportId)
					subordinates.add(employee);
			}
		} catch (NullPointerException ex) {
		}
		return subordinates;
	}

	public void printHeirarchyTree(Employee localRoot, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.println(localRoot.getName());

		List<Employee> subordinates = localRoot.getSubordinates();
		System.out.print(" ");
		for (Employee employee : subordinates) {
			printHeirarchyTree(employee, level + 1);
		}
	}



	public static HashMap<Integer, Employee> getEmployees() {
		return employees;
	}

}
