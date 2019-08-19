package com.techlabs.college;

import java.util.*;
public class College  {
	
	private int collegeID;
	private String collegeName;
	private ArrayList<Student> students;
	private ArrayList<Professor> professors;
	private int studentsCount;
	private int professorsCount;
	
	public College(int collegeID, String collegeName) {
		this.collegeID = collegeID;
		this.collegeName = collegeName;
		students = new ArrayList<Student>();
		professors = new ArrayList<Professor>();
	}
	
	public int getCollegeID() {
		return collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public Iterable<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		studentsCount+=1;
		students.add(student);
	}

	public Iterable<Professor> getProfessors() {
		return professors;
	}

	public void addProfessors(Professor prof) {
		professorsCount+=1;
		professors.add(prof);
	}

	public int getStudentsCount() {
		return studentsCount;
	}

	public int getProfessorsCount() {
		return professorsCount;
	}
	
}
