package com.techlabs.college.test;

import com.techlabs.college.*;

public class CollegeTest {
	public static void main(String[] args) {
		Student student1 = new Student(1,"Andheri","12/01/97",Branches.COMPUTER);
		Student student2 = new Student(2,"Bandra","20/04/97",Branches.IT);
//		System.out.println(" Branch: " + student.getBranch());
		
		Professor prof1 = new Professor(1,"Bandra","10/08/72",30000);
		Professor prof2 = new Professor(2,"Borivali","25/10/76",20000);
//		System.out.println(" Salary: " + prof.calSalary());
		
		College college1 = new College(1,"Viva");
		college1.addStudents(student1);
		college1.addStudents(student2);
		
		college1.addProfessors(prof1);
		college1.addProfessors(prof2);
		
		display(college1);
		
	}

	private static void display(College c) {
		System.out.println("College ID: " + c.getCollegeID() + " College Name: " + c.getCollegeName());
		System.out.println("No. of students: " + c.getStudentsCount() + " No. of professors: " + c.getProfessorsCount());
		for(Student student: c.getStudents()) {
			System.out.println("Student ID: " + student.getId() + " DOB: " + student.getDob() + " Address: " + student.getAddress() 
			                       + " Branch: " + student.getBranch());
		}
		
		for(Professor prof:c.getProfessors()) {
			System.out.println("Professor ID: " + prof.getId() + " DOB: " + prof.getDob() 
			        + " Address: " + prof.getAddress() + " Salary: " + prof.calSalary());
			
		}
	}
}
