package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class URLFileLoader implements ILoadable<Employee>{

	private String path;
	private HashMap<Integer,Employee> employees = new HashMap<Integer,Employee>();
	private Parser parser = new Parser();

	public URLFileLoader(String path) {
		this.path = path;
	}

	@Override
	public HashMap<Integer,Employee> loadData() {
		String row = "";
		try {
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream inputStream = connection.getInputStream();

			BufferedReader csvReader = new BufferedReader(new InputStreamReader(inputStream));
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				Employee employee = parser.parseEmloyeeDetails(data);
				employees.put(employee.getId(),employee);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
