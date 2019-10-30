package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repository.BankRepository;

@Service
public class AuthService {
	
	@Autowired
	private BankRepository bankRepo;
	
	public boolean validateUser(String username, String password) {
		boolean isValid = false;
		
		String databasePassword = bankRepo.getPassword(username);
		
		if(databasePassword.equals(password))
			isValid = true;
		
		return isValid;
	}
	
	public boolean isUsernameTaken(String accName) {
		return bankRepo.isUsernameTaken(accName);	
	}

}
