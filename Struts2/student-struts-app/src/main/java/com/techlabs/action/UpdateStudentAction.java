package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.EditStudentVM;

public class UpdateStudentAction extends ActionSupport implements ModelDriven<EditStudentVM> {
	
private EditStudentVM editVM;
	
	@Override
	public EditStudentVM getModel() {
		editVM = new EditStudentVM();
		return editVM;
	}
	
	
	@Override
	public void validate() {
		
		if(editVM.getRollNo() == 0)
			addFieldError("rollNo", "Roll No. can't be 0");
		
		if("".equals(editVM.getName()))
			addFieldError("name", "Name can't be empty");
		
		if(editVM.getAge() == 0)
			addFieldError("age", "Age can't be 0");
		
		if("".equals(editVM.getEmail()))
			addFieldError("email", "Email can't be empty");
	}
	
	public String update() {
		StudentService service = StudentService.getInstance();
		Student student = service.getStudent(editVM.getId());
		
		service.updateStudent(student, editVM.getRollNo(), editVM.getName(), editVM.getAge(), editVM.getEmail());
		return "success";
	}

}
