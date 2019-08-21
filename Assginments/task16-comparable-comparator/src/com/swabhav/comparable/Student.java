package com.swabhav.comparable;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student student) {
		return this.age - student.age;
	}

}
