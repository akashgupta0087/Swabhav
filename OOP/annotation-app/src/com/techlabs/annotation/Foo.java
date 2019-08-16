package com.techlabs.annotation;

public class Foo {
	@NeedToRefactor
	public void m1() {
		System.out.println("Inside m1");

	}

	public void m2() {
		System.out.println("Inside m2");

	}

	@NeedToRefactor
	public void m3() {
		System.out.println("Inside m3");

	}

	public void m4() {
		System.out.println("Inside m4");

	}

}
