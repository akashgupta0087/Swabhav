package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

	
	@Service("studentSVC2")
	public class StudentService2 {
		
		@Autowired
		private StudentRepository repository;
		
		public StudentService2() {
			System.out.println("Inside Student Service2");
		}
		
		public List<Student> getStudents(){
			return repository.getStudents();
		}
		
}
