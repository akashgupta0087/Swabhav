package com.techlabs.basic;

public class ArgumentsTest {
	public static void main(String[] args) {
		int argsLength = args.length;

		System.out.println("The length of the args is = " + argsLength);

		if (args.length != 0) {
			for (int i = 0; i < args.length; i++)
				System.out.println("Hello " + args[i]);
		} else {
			System.out.println("Please enter the arguments");
		}

		System.out.println("Thank You");
	}
}