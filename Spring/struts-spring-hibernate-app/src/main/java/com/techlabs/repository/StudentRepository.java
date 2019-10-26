package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {
	
	List<Student> students = new ArrayList<Student>();
	@Autowired
	private SessionFactory factory;
	
	private Session session;

	private StudentRepository() {
		
		System.out.println("Inside Student Repository");
		System.out.println(factory);
	}
	
	public void addStudent(int rollNo, String name, int age, String email) {
		Student s1 = new Student();
		s1.setRollNo(rollNo);
		s1.setName(name);
		s1.setAge(age);
		s1.setEmail(email);
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(s1);
		txn.commit();
		session.close();
		
	}

	public List<Student> getStudents() {
		Session session = factory.openSession();
		List<Student> list = session.createCriteria(Student.class).list();
		session.close();
		return list;
	}

	public Student getStudent(String id) {
		System.out.println("Id is from getStudent: " + id);
		session = factory.openSession();
		UUID newId = UUID.fromString(id);
		Student studentFound = (Student) session.get(Student.class, newId);
		System.out.println("Student is : " + studentFound);
		session.close();
		return studentFound;
	}

	public void updateStudent(String id, int rollNo, String name, int age, String email) {
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		UUID newId = UUID.fromString(id);
		Student student = (Student) session.get(Student.class, newId);
		student.setRollNo(rollNo);
		student.setName(name);
		student.setAge(age);
		student.setEmail(email);
		session.update(student);
		txn.commit();
		session.close();
	}
	
	public void deleteStudent(String id) {
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		UUID newId = UUID.fromString(id);
		Student student = (Student) session.get(Student.class, newId);
		session.delete(student);
		txn.commit();
		session.close();
	}

}
