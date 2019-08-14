package com.techlabs.inheritance.test;

import com.techlabs.inheritance.*;

public class InheritanceTest {
	public static void main(String[] args) {
		System.out.println("Case1 :");
		case1();
		System.out.println("Case2 :");
		case2();
		System.out.println("Case3 :");
		case3();
		System.out.println("Case4 :");
		case4();
	}
	
	public static void case1() {
		Man x; // x expects man type object
		x = new Man();
		x.read();
		x.play();
	}
	
	public static void case2() {
		Boy y; // y expects boy type object
		y = new Boy();
		y.eat();
		y.play();
		y.walk();
		y.read();
	}
	
	
	public static void case3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
	}
	
	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	
	public static void Case5() {
		Object x;
		x = 10;
		x = "Hello World!!";
		x = new Man();
	}
	
	private static void atThePark(Man x){
		System.out.print("At the Park.... ");
		x.play();
	}
}
