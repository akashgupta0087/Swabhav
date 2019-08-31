package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;

public class AutomobileTest {
	public static void main(String[] args) {
		AutomobileFactory factory = AutomobileFactory.getInstance();
		AutomobileFactory factory2 = AutomobileFactory.getInstance();
		
		System.out.println(factory.hashCode());
		System.out.println(factory2.hashCode());
		
		IAutomobile bmw = factory.make(AutoType.BMW);
		IAutomobile audi = factory.make(AutoType.Audi);
		IAutomobile tesla = factory.make(AutoType.Tesla);
		
		bmw.start();
		bmw.stop();
		
		System.out.println("");
		audi.start();
		audi.stop();
		
		System.out.println("");
		tesla.start();
		tesla.stop();
	}

}
