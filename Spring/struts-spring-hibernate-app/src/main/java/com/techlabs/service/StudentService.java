package com.techlabs.service;

import java.util.List;
import java.util.UUID;

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
	
	public void addStudent(int rollNo, String name, int age, String email) {
		repository.addStudent(rollNo, name, age, email);
	}
	
	public Student getStudent(String id) {
		return repository.getStudent(id);
	}
	
	public void updateStudent(String id, int rollNo, String name, int age, String email) {
		repository.updateStudent(id, rollNo, name, age, email);
	}
	
	public void deleteStudent(String id) {
		repository.deleteStudent(id);
	}

}
