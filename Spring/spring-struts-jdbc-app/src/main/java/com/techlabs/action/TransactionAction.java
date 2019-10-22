package com.techlabs.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.BankService;
import com.techlabs.viewmodel.TransactionVM;

public class TransactionAction extends ActionSupport implements ModelDriven<TransactionVM> {

	private TransactionVM transactionVM;
	

	@Autowired
	private BankService service;
	
	
	@Override
	public TransactionVM getModel() {
		transactionVM = new TransactionVM();
		return transactionVM;
	}

	@Override
	public void validate() {

		if (transactionVM.getAmount() == 0)
			addFieldError("amount", "Amount can't be 0");
	}

	@Override
	public String execute() {

		HttpSession session = ServletActionContext.getRequest().getSession(false);
		String accName = (String) session.getAttribute("loggedIn");

		try {
			
			if (transactionVM.getTransaction().equals("Deposit"))
				service.deposit(accName, transactionVM.getAmount());
			
			if (transactionVM.getTransaction().equals("Withdraw"))
				service.withdraw(accName, transactionVM.getAmount());
			
			return "success";
		}

		catch (SQLException e) {
			
			transactionVM.setMessage(e.getMessage());
			
			return "limit";
		}
	}

}
