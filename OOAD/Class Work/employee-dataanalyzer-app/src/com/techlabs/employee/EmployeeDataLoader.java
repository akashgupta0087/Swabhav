package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class EmployeeDataLoader {
	
	private LinkedHashSet<Employee> empList = new LinkedHashSet<Employee>();

	public LinkedHashSet<Employee> loadEmpDetails(String path) {
		String row = "";
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(path));
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				setEmployeeData(data);
			}
			csvReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	public LinkedHashSet<Employee> loadEmpDetailsFromWeb(String urlPath) {
		String row = "";
		try {
			URL url = new URL(urlPath);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream inputStream = connection.getInputStream();

			BufferedReader csvReader = new BufferedReader(new InputStreamReader(inputStream));
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				setEmployeeData(data);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return empList;

	}

	private Integer convertToNull(String value) {
		if (value.equals("NULL"))
			return null;
		return Integer.parseInt(value);
	}
	
	private void setEmployeeData(String[] data) {
		int id = Integer.parseInt(data[0]);
		String name = data[1];
		String designation = data[2];
		Integer managerId = convertToNull(data[3]);
		String doj = data[4];
		double salary = Double.parseDouble(data[5]);
		Integer commission = (convertToNull(data[6]));

		int deptNumber = Integer.parseInt(data[7]);

		empList.add(new Employee(id, name, designation, managerId, doj, salary, commission, deptNumber));
	}

}
