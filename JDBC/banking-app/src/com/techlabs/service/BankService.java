package com.techlabs.service;

import com.techlabs.model.Account;
import com.techlabs.repository.BankRepository;

public class BankService {
	
	BankRepository bankRepo;
	
	public BankService() {
		bankRepo = BankRepository.getInstance();
	}
	
	public void addAccount(Account account) {
		bankRepo.addAccount(account);
	}

}
