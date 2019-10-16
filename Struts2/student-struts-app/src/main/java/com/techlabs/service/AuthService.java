package com.techlabs.service;

public class AuthService {
	
	public boolean validateUser(String username, String password) {
		boolean isValid = false;
		if(username.equals("admin") && password.equals("admin"))
			isValid = true;
		return isValid;
	}

}
