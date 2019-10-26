package com.techlabs.action;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action{
	
	@Autowired
	private StudentService service;
	
	@Autowired
	private SessionFactory factory;
	
	private List<Student> students;

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents(){
		return service.getStudents();
	}

	@Override
	public String execute() throws Exception {
		System.out.println(factory.getClass());
		students = getStudents();
//		System.out.println(students.size());
		return "success";
	}

}
