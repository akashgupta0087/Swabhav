package com.swabhav.comparator;

import java.util.*;

public class StudentComparatorTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList1 = new ArrayList<Student>();
		
		studentList1.add(new Student(2,"Vijay",15));  
		studentList1.add(new Student(5,"Ajay",10));  
		studentList1.add(new Student(1,"Jai",12));
		
		System.out.println("List sorted by age :");
		
		Collections.sort(studentList1,new AgeComparator());
		
		for(Student student: studentList1) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getAge());
		}
		
		System.out.println(" ");
		System.out.println("List sorted by name : ");
		
		Collections.sort(studentList1, new NameComparator());
		
		for(Student student: studentList1) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getAge());
		}
		
		
	}

}
