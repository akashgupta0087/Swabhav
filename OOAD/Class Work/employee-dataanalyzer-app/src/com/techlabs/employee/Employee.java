package com.techlabs.employee;

import java.util.LinkedHashSet;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private Integer managerId;
	private String doj;
	private double salary;
	private Integer commission;
	private int deptNumber;

	public Employee(int id, String name, String designation, Integer managerId, String doj, double salary,
			Integer commmission, int deptNumber) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		this.doj = doj;
		this.salary = salary;
		this.commission = commmission;
		this.deptNumber = deptNumber;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public String getDoj() {
		return doj;
	}

	public double getSalary() {
		return salary;
	}

	public Integer getCommmission() {
		return commission;
	}

	public int getDeptNumber() {
		return deptNumber;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return this.id == ((Employee) (obj)).id;
	}

}
