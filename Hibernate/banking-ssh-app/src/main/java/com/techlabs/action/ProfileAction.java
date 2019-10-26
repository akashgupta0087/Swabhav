package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.BankService;

public class ProfileAction implements Action{
	
	private float balance;
	
	@Autowired
	private BankService service;
	
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String execute() throws Exception {
		
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		balance = service.getBalance((String) session.getAttribute("loggedIn"));
		return "success";
	}

}
