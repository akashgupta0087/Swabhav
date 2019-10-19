package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action{
	
	@Autowired
	private StudentService service;
	
	private List<Student> students;

	public List<Student> getStudents(){
		return service.getStudents();
	}

	@Override
	public String execute() throws Exception {
		students = getStudents();
		System.out.println(students.size());
		return "none";
	}

}
