package com.techlabs.action;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.EditStudentVM;

public class EditStudentAction implements Action, ModelDriven<EditStudentVM> {

	private EditStudentVM editVM;
	
	@Autowired
	private StudentService service;
	

	@Override
	public EditStudentVM getModel() {
		editVM = new EditStudentVM();
		return editVM;
	}
	
	@Override
	public String execute() {
		
		Student student = service.getStudent(editVM.getId());
		System.out.println("Id: " + editVM.getId());
		editVM.setRollNo(student.getRollNo());
		editVM.setName(student.getName());
		editVM.setAge(student.getAge());
		editVM.setEmail(student.getEmail());
		return "success";
		
	}
	

}
