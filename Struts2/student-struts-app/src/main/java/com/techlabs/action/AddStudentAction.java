package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.AddStudentVM;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddStudentVM> {

	AddStudentVM addVM;

	@Override
	public AddStudentVM getModel() {
		addVM = new AddStudentVM();
		return addVM;
	}

	@Override
	public String execute() {

		return "success";
	}

	@Override
	public void validate() {
		if (addVM.getRollNo() == 0)
			addFieldError("rollNo", "Roll No. can't be 0");

		if ("".equals(addVM.getName()))
			addFieldError("name", "Name can't be empty");

		if (addVM.getAge() == 0)
			addFieldError("age", "Age can't be 0");

		if ("".equals(addVM.getEmail()))
			addFieldError("email", "Email can't be empty");
	}

	public String addStudent() {

			StudentService service = StudentService.getInstance();
			service.addStudent(addVM.getRollNo(), addVM.getName(), addVM.getAge(), addVM.getEmail());
			return "success";
	}

}
