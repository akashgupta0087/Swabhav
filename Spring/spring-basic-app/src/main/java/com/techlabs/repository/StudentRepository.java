package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {
	
	List<Student> students = new ArrayList<Student>();

	private StudentRepository() {
		System.out.println("Inside Student Repository");
		
		Student sachin = new Student(25, "Sachin", 45, "sachin@gmail.com");
		Student dhoni = new Student(27, "Dhoni", 35, "dhoni@gmail.com");
		Student virat = new Student(26, "Virat", 30, "virat@gmail.com");
		
		students.add(sachin);
		students.add(dhoni);
		students.add(virat);
		
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
