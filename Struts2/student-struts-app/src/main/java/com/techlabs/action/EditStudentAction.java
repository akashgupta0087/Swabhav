package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.EditStudentVM;

public class EditStudentAction extends ActionSupport implements ModelDriven<EditStudentVM> {

	private EditStudentVM editVM;
//	private String id;

	@Override
	public EditStudentVM getModel() {
		editVM = new EditStudentVM();
		return editVM;
	}
	
	@Override
	public String execute() {
		
		Student student = StudentService.getInstance().getStudent(editVM.getId());
		editVM.setRollNo(student.getRollNo());
		editVM.setName(student.getName());
		editVM.setAge(student.getAge());
		editVM.setEmail(student.getEmail());
		return "success";
		
	}
	

}
