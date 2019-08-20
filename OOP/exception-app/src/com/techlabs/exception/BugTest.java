package com.techlabs.exception;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;

public class BugTest {
	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c = a/b;
		System.out.println("Result is: " + c);
		}
		catch(ArrayIndexOutOfBoundsException ao) {
			System.out.println("Give at least two input numbers");
		}
		catch(ArithmeticException ae) {
			System.out.println("The denominator should not be zero in divison");
		}
		catch(NumberFormatException nf) {
			System.out.println("The two inputs should be a number");
		}
		finally {
			System.out.println("Thank you");
		}
		
		
		
//		ReflectiveOperationException;
//		FileNotFoundException;
//		NotSerializableException;
//		CloneNotSupportedException;
//		NullPointerException;
//		ClassCastException;
//		StackOverflowError;
//		VirtualMachineError;
//		OutOfMemoryError;
		
	}

}
