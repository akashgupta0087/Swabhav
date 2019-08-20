package com.techlabs.exception;

public class StackTraceTest2 {
	public static void main(String[] args) {
		try {
			m1();
		}
		catch(RuntimeException re){
			System.out.println(re.getMessage());
		}
		
		finally {
		System.out.println("End of main");
		}
	}
	
	
	private static void m1() {
		System.out.println("Inside m1");
		m2();
	}
	
	private static void m2() {
		System.out.println("Inside m2");
		m3();
	}
	
	private static void m3(){
		System.out.println("Inside m3");
		throw new RuntimeException("Something went wrong in m3");
	}


}
