package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodel.TransactionVM;

public class TransactionLoaderAction implements Action, ModelDriven<TransactionVM> {

	private List<String> genders;
	private TransactionVM transactionVM;
	
	
	public TransactionLoaderAction() {
		genders = new ArrayList<String>();
		 
		genders.add("Deposit");
		genders.add("Withdraw");
		
	}
	
	public List<String> getGenders() {
		return genders;
	}

	public void setGenders(List<String> genders) {
		this.genders = genders;
	}
	
	@Override
	public String execute() throws Exception {
		return "success";
	}

	@Override
	public TransactionVM getModel() {
		transactionVM = new TransactionVM();
		return transactionVM;
	}

}
