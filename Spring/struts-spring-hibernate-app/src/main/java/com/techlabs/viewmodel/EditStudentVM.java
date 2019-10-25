package com.techlabs.viewmodel;

import java.util.UUID;

public class EditStudentVM {
	
	private UUID id;
	private int rollNo;
	private String name;
	private int age;
	private String email;
	
	public UUID getId() {
		System.out.println("Id in EditVM Get : " + id);
		return id;
	}
	
	public void setId(UUID id) {
		System.out.println("Id in EditVM Set : " + id);
		this.id = id;
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
