package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class JsonAction implements Action {
	
	private String id = "101";
	private int rollNo = 26;
	private String name = "Sachin";
	private int age = 45;
	private String email = "sachin@gmail.com";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	@Override
	public String execute() throws Exception {
		return "success";
	}
	
	

}
