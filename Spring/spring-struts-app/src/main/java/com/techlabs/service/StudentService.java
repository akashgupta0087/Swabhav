package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service()
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public StudentService() {
		System.out.println("Inside Student Service");
	}
	
	public List<Student> getStudents(){
		return repository.getStudents();
	}

}
