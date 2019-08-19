package com.techlabs.exception;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;

public class BugTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c = a/b;
		System.out.println("Result is: " + c);
		
		main(args);
		
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
