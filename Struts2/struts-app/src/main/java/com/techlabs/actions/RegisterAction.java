package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodel.RegisterVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterVM> {

	private RegisterVM vm;
	
	@Override
	public RegisterVM getModel() {
		vm = new RegisterVM();
		return vm;
	}
	
	@Override
	public String execute() {
		return "success";
	}
	
	@Override
	public void validate() {
		if(vm.getRollNo() == 0)
			addFieldError("rollNo", "Roll No. can't be 0");
		if("".equals(vm.getFirstname()))
			addFieldError("firstname", "Firstname can't be empty");
		if("".equals(vm.getLastname()))
			addFieldError("lastname", "Lastname can't be empty");
		if(vm.getAge() == 0)
			addFieldError("age", "Age can't be 0");
		if("".equals(vm.getLocation()))
			addFieldError("location", "Location can't be empty");
		
	}
	
	public String doRegistration() {
		
		vm.setMessage("We have taken your details. We will get in touch with you ASAP\n"
				+ "Roll No. : " + vm.getRollNo() + "\n"
				+ "Firstname : " + vm.getFirstname() + "\n"
			    + "Lastname : " + vm.getLastname() + "\n"
			    + "Age : " + vm.getAge() + "\n"
			    + "Location : " + vm.getLocation() + "\n");
		return "success";
		
	}
	
	

}
