package com.swabhav.comparable;

import java.util.*;

public class StudentComparableTest {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList=new ArrayList<Student>(); 
		
		studentList.add(new Student(2,"Vijay",15));  
		studentList.add(new Student(5,"Ajay",10));  
		studentList.add(new Student(1,"Jai",12));  
		
		Collections.sort(studentList);
		
		for(Student student:studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getAge());
		}
	}

}
