package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Account;
import com.techlabs.model.TransactionLog;
import com.techlabs.repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepo;
	
	public void addAccount(Account account) throws SQLException {
		bankRepo.addAccount(account);
	}
	
	public float getBalance(String accName) {
		float balance = bankRepo.getBalance(accName);
		return balance;
	}
	
	public void deposit(String accName, float amount) throws SQLException {
		bankRepo.deposit(accName, amount);
	}
	
	public void withdraw(String accName, float amount) throws SQLException {
		bankRepo.withdraw(accName, amount);
	}
	
	public List<TransactionLog> getTransactions(String accName){
		List<TransactionLog> transactions = new ArrayList<TransactionLog>();
		transactions = bankRepo.getTransactions(accName);
		return transactions;
	}
}
