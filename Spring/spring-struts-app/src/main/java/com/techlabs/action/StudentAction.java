package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentAction {
	
	@Autowired
	private StudentService service;
	
	public List<Student> getStudents(){
		return service.getStudents();
	}

}
