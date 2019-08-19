package com.techlabs.college;

public class Student extends Person {
	private Branches branch;

	public Student(int id, String address, String dob, Branches branch) {
		super(id, address, dob);
		this.branch = branch;

	}

	public Branches getBranch() {
		return branch;
	}

}
