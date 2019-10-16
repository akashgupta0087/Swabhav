package com.techlabs.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {
	
	
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public String execute() throws Exception {
		StudentService service = StudentService.getInstance();
		students = service.getStudents();
		for(Student student : students) {
		System.out.println(student);
		}
		return "success";
	}
	

}
