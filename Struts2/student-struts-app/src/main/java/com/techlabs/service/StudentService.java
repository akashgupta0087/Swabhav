package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	
	private static StudentService serviceInstance;
	
	List<Student> students = new ArrayList<Student>();

	private StudentService() {
		Student sachin = new Student(25, "Sachin", 45, "sachin@gmail.com");
		students.add(sachin);
	}

	public static StudentService getInstance() {
		if (serviceInstance == null) {
			serviceInstance = new StudentService();
		}
		return serviceInstance;
	}

	public void addStudent(int rollNo, String name, int age, String email) {
		Student s1 = new Student(rollNo, name, age, email);
		students.add(s1);
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudent(String id) {
		Student studentFound = null;
		for (Student student : students) {
			if (student.getId().equals(id)) {
				studentFound = student;
				break;
			}
		}
		return studentFound;
	}

	public void updateStudent(Student student, int rollNo, String name, int age, String email) {
		student.setRollNo(rollNo);
		student.setName(name);
		student.setAge(age);
		student.setEmail(email);
	}

	public void deleteStudent(String id) {
		int index = 0;
		for (Student student : students) {
			if (student.getId().equals(id)) {
				break;
			}
			index++;
		}
		students.remove(index);
	}

}
