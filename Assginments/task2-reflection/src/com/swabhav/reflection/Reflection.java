package com.swabhav.reflection;

import java.lang.reflect.*;

public class Reflection {
	public void reflect(Class cls) {

		int getterCount = 0;
		int setterCount = 0;

		Method[] methods = cls.getDeclaredMethods();
		System.out.println("No. of methods = " + methods.length);
		for (Method method : methods) {
			if (isGetter(method))
				getterCount++;
			if (isSetter(method))
				setterCount++;
		}

		System.out.println("No. of getter methods = " + getterCount);
		System.out.println("No. of setter methods = " + setterCount);

		Constructor[] constructors = cls.getConstructors();
		System.out.println("No. of constructors = " + constructors.length);
//	   for(Constructor constructor:constructors) {
//		   System.out.println(constructor.getName());
//	   }

	}

	private static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	private static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}
}