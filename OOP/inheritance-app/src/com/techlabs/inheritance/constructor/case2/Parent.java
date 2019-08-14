package com.techlabs.inheritance.constructor.case2;

public class Parent {
	private int foo;
	
	public Parent(int foo) {
		this.foo = foo;
		System.out.println("Inside parent constructor");
	}

	public int getFoo() {
		return foo;
	}

}
