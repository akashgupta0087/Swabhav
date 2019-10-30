package com.techlabs.action;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Account;
import com.techlabs.service.BankService;
import com.techlabs.viewmodel.RegistrationVM;

public class RegistrationAction extends ActionSupport implements ModelDriven<RegistrationVM> {

	private RegistrationVM regVM;
//	private String username;
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}

	@Autowired
	private BankService service;

	@Override
	public RegistrationVM getModel() {
		regVM = new RegistrationVM();
		return regVM;
	}

	@Override
	public void validate() {
		if ("".equals(regVM.getAccName()))
			addFieldError("accName", "Name can't be empty");

		if ("".equals(regVM.getAccPassword()))
			addFieldError("accPassword", "Password can't be empty");

		if (regVM.getBalance() == 0)
			addFieldError("balance", "Opening balance can't be 0");
	}

	@Override
	public String execute() {

		try {
			service.addAccount(regVM.getAccName(), regVM.getAccPassword(), regVM.getBalance());
			return "success";

		} catch (HibernateException e) {
			regVM.setMessage("Record already exists");
			return "register";

		}
	}
	
//	public String validateUsername() {
//		System.out.println("Inside validateUsername");
//		System.out.println(username);
//		return "success";
//	}

}
