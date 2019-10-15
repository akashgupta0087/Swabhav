package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String execute() {
		return "success";
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void validate() {
		System.out.println("Inside validate");
		if("".equals(getUsername()))
			addFieldError("username", "Username can't be empty");
		if("".equals(getPassword()))
			addFieldError("password", "Password can't be empty");
	}

}
