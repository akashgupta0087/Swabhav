package com.techlabs.employee.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

		Employee root = analyzer.getRootNode();
		
		analyzer.constructHeirarchyTree(root);
		
		StringBuilder strBuild = analyzer.printHeirarchyTree(root, 0);
		
		
		
		File file = new File("Resources/employee.xml");
		try(BufferedWriter bwriter = new BufferedWriter(new FileWriter(file))){
			bwriter.write(strBuild.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		for(Map.Entry employee: analyzer.getEmployees().entrySet()){
//		System.out.println(employee.getKey() + " " + employee.getValue());
//		}

	}

}
