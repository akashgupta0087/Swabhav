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

public class FileLoader implements ILoadable<Employee> {

	private String path;
	private LinkedHashSet<Employee> employees = new LinkedHashSet<Employee>();

	public FileLoader(String path) {
		this.path = path;
	}

	@Override
	public LinkedHashSet<Employee> loadData() {
		String row = "";
		Parser parser = new Parser();
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(path));
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				Employee employee = parser.parseEmloyeeDetails(data);
				employees.add(employee);
			}
			csvReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
