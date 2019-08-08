package com.swabhav.reflection.test;

import com.swabhav.reflection.Reflection;

public class ReflectionTest {
	public static void main(String[] args) {
		display("com.swabhav.reflection.Rectangle");
		display("java.io.PrintStream");
		display("java.lang.Object");
	}

	private static void display(String className) {
		try {
			Reflection reflection = new Reflection();
			Class cls = Class.forName(className);
			System.out.println(className);
			reflection.reflect(cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
