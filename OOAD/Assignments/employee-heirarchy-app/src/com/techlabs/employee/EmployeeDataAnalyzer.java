package com.techlabs.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class EmployeeDataAnalyzer {
	private LinkedHashSet<Employee> employees = new LinkedHashSet<Employee>();
	ILoadable loader;

	public EmployeeDataAnalyzer(ILoadable loader) {
		this.loader = loader;
		employees = loader.loadData();
	}

	public LinkedHashSet<Employee> getEmployeeList() {
		return employees;
	}

	public Employee getMaxSalariedEmployee() {
		double maxSalary = 0;
		Employee maxSalariedEmployee = null;
		for (Employee employee : employees) {
			maxSalary = Math.max(maxSalary, employee.getSalary());
		}

		for (Employee employee : employees) {
			if (maxSalary == employee.getSalary()) {
				maxSalariedEmployee = employee;
				break;
			}
		}
		return maxSalariedEmployee;
	}

	public HashMap<Integer, Integer> getDeptWiseEmployees() {
		HashMap<Integer, Integer> deptWiseEmployees = new HashMap<Integer, Integer>();
		ArrayList<Integer> deptNumbers = new ArrayList<Integer>();

		for (Employee employee : employees) {
			deptNumbers.add(employee.getDeptNumber());
		}

		for (Integer i : deptNumbers) {
			if (!deptWiseEmployees.containsKey(i)) {
				deptWiseEmployees.put(i, 1);
			} else {
				deptWiseEmployees.put(i, deptWiseEmployees.get(i) + 1);
			}
		}
		return deptWiseEmployees;
	}

	public HashMap<String, Integer> getDesignationWiseEmployees() {
		HashMap<String, Integer> designationWiseEmployees = new HashMap<String, Integer>();
		ArrayList<String> desginations = new ArrayList<String>();

		for (Employee employee : employees) {
			desginations.add(employee.getDesignation());
		}

		for (String desgination : desginations) {
			if (!designationWiseEmployees.containsKey(desgination)) {
				designationWiseEmployees.put(desgination, 1);
			} else {
				designationWiseEmployees.put(desgination, designationWiseEmployees.get(desgination) + 1);
			}
		}
		return designationWiseEmployees;
	}

	public void findHeirachy() {
		Employee president = getMaxSalariedEmployee();

		for (Employee manager : employees) {
			try {
				if (president.getId() == manager.getManagerId()) {
					president.add(manager);
					for (Employee employee : employees) {
						try {
							if (manager.getId() == employee.getManagerId()) {
								manager.add(employee);
								for(Employee clerk: employees) {
									try {
									if(employee.getId() == clerk.getManagerId()) {
										employee.add(clerk);
									}}
									catch(NullPointerException ex) {}
								}
							}
						} catch (NullPointerException ex) {
						}
					}
				}
			} catch (NullPointerException ex) {
			}
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t" + president.getName() + ": " + president.getDesignation());
		for (Employee manager : president.getSubordinates()) {
			System.out.print("\t\t\t\t        " + manager.getName() + ": " + manager.getDesignation());
		}
		System.out.println(" ");
		for (Employee manager : president.getSubordinates()) {
			for (Employee employee : manager.getSubordinates()) {
				System.out.print(employee.getName() + ": " + employee.getDesignation());
			}
			System.out.print("\t        ");
		}
		
		System.out.println("\t\t\t\t\t\t");
		for (Employee manager : president.getSubordinates()) {
			for (Employee employee : manager.getSubordinates()) {
				for(Employee clerk:employee.getSubordinates()) {
					System.out.print( clerk.getName() + ": " + clerk.getDesignation());
				}
			}
		}
	}
}
