package com.techlabs.factorymethod.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factorymethod.BMWFactory;
import com.techlabs.factorymethod.IAutoFactory;
import com.techlabs.factorymethod.IAutomobile;

public class FactoryMethodTest {
	public static void main(String[] args) {
		IAutoFactory factory = makeFactory();

		IAutomobile auto = factory.make();

		auto.start();
		auto.stop();
	}

	private static IAutoFactory makeFactory() {
		IAutoFactory factory = null;
		String className = null;
		Properties prop = new Properties();
		InputStream input = null;
		Class cls = null;

		try {
			input = new FileInputStream("Resources\\factories.properties");
			prop.load(input);
			className = prop.getProperty("factory.to.create");
			cls = Class.forName(className);
			
			Method methodCall = cls.getDeclaredMethod("getInstance");
			factory = (IAutoFactory) methodCall.invoke(null);

		} catch (IOException io) {

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}
}
