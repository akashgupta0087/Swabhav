package com.techlabs.annotation.test;

import com.techlabs.annotation.*;

import java.lang.reflect.*;

public class Test {
	public static void main(String[] args) {

		Foo obj = new Foo();
		try {
			int count = 0;
			Class cls = Class.forName("com.techlabs.annotation.Foo");

			Class annotations = Class.forName("com.techlabs.annotation.NeedToRefactor");

			Method[] methods = cls.getMethods();

			for (Method method : methods) {
				if (method.isAnnotationPresent(annotations)) {
					System.out.println(method.getName());
					count++;
					method.invoke(obj);					
				}
			}
			System.out.println("Annotation Methods are: " + count);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
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
