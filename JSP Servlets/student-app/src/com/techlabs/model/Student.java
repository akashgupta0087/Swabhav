package com.techlabs.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {

	private String id;
	private int rollNo;
	private String name;
	private int age;
	private String email;
	
	public Student(int rollNo, String name, int age, String email) {
		LocalDateTime dateObj = LocalDateTime.now();  
	    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");  
	    String formattedDate = dateObj.format(formatObj);  
	    
		this.id = formattedDate;
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
