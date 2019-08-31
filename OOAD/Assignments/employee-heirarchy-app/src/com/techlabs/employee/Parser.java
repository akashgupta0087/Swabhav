package com.techlabs.employee;

public class Parser {

	FileLoader loader;

	public Employee parseEmloyeeDetails(String[] data) {
		Employee employee = new Employee(Integer.parseInt(data[0]), data[1], data[2], convertToNull(data[3]), data[4],
				Double.parseDouble(data[5]), convertToNull(data[6]), Integer.parseInt(data[7]));
		
		return employee;
	}

	private Integer convertToNull(String value) {
		if (value.equals("NULL"))
			return null;
		return Integer.parseInt(value);
	}
}
