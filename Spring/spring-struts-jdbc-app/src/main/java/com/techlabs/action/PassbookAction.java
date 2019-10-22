package com.techlabs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.TransactionLog;
import com.techlabs.service.BankService;

public class PassbookAction implements Action {
	
	private List<TransactionLog> transactions;
	
	@Autowired
	private BankService service;
	
	
	public List<TransactionLog> getTransactions() {
		return transactions;
	}

	@Override
	public String execute() throws Exception {
		
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		String accName = (String) session.getAttribute("loggedIn");
		
		transactions = service.getTransactions(accName);
		
		return "success";
	}

}
