package com.techlabs.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class EmployeeDataAnalyzer {
	private static HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
	private static Employee root;
	ILoadable loader;
	StringBuilder strBuild;

	public EmployeeDataAnalyzer(ILoadable loader) {
		this.loader = loader;
		employees = loader.loadData();
		strBuild = new StringBuilder();

	}

	public Employee getRootNode() {
		for (Employee employee : employees.values()) {
			if (employee.getManagerId() == null)
				root = employee;
		}
		return root;
	}

	public void constructHeirarchyTree(Employee localRoot) { // Can remove localRoot because it is not doing anything in new code
		//Employee employee = localRoot;
		//List<Employee> subordinates = getSubordinatesById(employee.getId());
		
		for(Map.Entry employee : employees.entrySet()) {  
			try {
			employees.get(((Employee)employee.getValue()).getManagerId()).getSubordinates().add((Employee)employee.getValue());
			}
		
		catch(NullPointerException ex) {
		}
		}
				
//		employee.setSubordinates(subordinates);
//		if (subordinates.size() == 0)
//			return;
//
//		for (Employee emp : subordinates) {
//			constructHeirarchyTree(emp);
//		}
	}
	
	
//	private List<Employee> getSubordinatesById(int reportId) {
//		List<Employee> subordinates = new ArrayList<Employee>();
//		try {
//			for (Employee employee : employees.values()) {
//				if (employee.getManagerId() == reportId)
//					subordinates.add(employee);
//			}
//		} catch (NullPointerException ex) {
//		}
//		return subordinates;
//	}

	public StringBuilder printHeirarchyTree(Employee localRoot, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		strBuild.append("<Employee id = \"" + localRoot.getId() + "\">");
		strBuild.append("<name>" + localRoot.getName() + "</name>");
		System.out.println(localRoot.getName());

		strBuild.append("<subordinate>");
		List<Employee> subordinates = localRoot.getSubordinates();
		System.out.print(" ");
		for (Employee employee : subordinates) {
			printHeirarchyTree(employee, level + 1);
		}
		strBuild.append("</subordinate>");
		strBuild.append("</Employee>");
		return strBuild;
		
	}



	public static HashMap<Integer, Employee> getEmployees() {
		return employees;
	}

}
