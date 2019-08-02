package com.techlabs.basic;

public class WelcomTest {

	public static void main(String[] args)
	{
		System.out.println("Hello World!!");
		System.err.println("This is an error");
		System.out.println('A');
		System.out.println(8.00000058);
		System.out.println(10);
		System.out.println(1.25f);
		
		printThis(10);
		printThis('A');
		printThis("Hello World!");
		printThis(8.02457845);
		printThis(10.25f);
	}
	
	private static void printThis(int i)
	{
		System.out.print(i);
		System.out.println(" This is an integer");
	}
	
	private static void printThis(char c)
	{
		System.out.print(c);
		System.out.println(" This is a character");
	}
	
	private static void printThis(String s)
	{
		System.out.print(s);
		System.out.println(" This is a string");

	}
	
	private static void printThis(double d)
	{
		System.out.print(d);
		System.out.println(" This is a double");

	}
	
	private static void printThis(float f)
	{
		System.out.print(f);
		System.out.println(" This is a float");

	}
}
