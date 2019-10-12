package com.techlabs.service;

import com.techlabs.repository.BankRepository;

public class AuthService {
	public boolean validateUser(String username, String password) {
		boolean isValid = false;
		
		String databasePassword = BankRepository.getInstance().getPassword(username);
		
		if(databasePassword.equals(password))
			isValid = true;
		
		return isValid;
	}

}
