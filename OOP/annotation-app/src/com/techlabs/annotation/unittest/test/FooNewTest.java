package com.techlabs.annotation.unittest.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.annotation.unittest.*;

public class FooNewTest {
	public static void main(String[] args) {
		
		FooNew obj = new FooNew();
		int count = 0;
		int testCaseCount = 0;
		try {
			Class fooClass = Class.forName("com.techlabs.annotation.unittest.FooNew");
			Class annotation = Class.forName("com.techlabs.annotation.unittest.TestCase");

			Method[] methods = fooClass.getMethods();

			for (Method method : methods) {
				if (method.isAnnotationPresent(annotation)) {
					//System.out.println(method.getName());
					count++;
					
					if((boolean) method.invoke(obj)) {
						testCaseCount++;
					}
				}
			}
			System.out.println("Annotation Methods are: " + count);
			System.out.println("Test cases passed are " + testCaseCount + " out of " + count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
