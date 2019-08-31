package com.techlabs.simplefactory;

public class AutomobileFactory {
	
	private static AutomobileFactory factory;
	
	private AutomobileFactory() {
		System.out.println("Factory created");
	}
	
	public static AutomobileFactory getInstance() {
		if(factory == null)
			return factory = new AutomobileFactory();
		return factory;
		}
	
	
	public IAutomobile make(AutoType type) {
		if(type == AutoType.BMW)
			return new BMW();
		if(type == AutoType.Audi)
			return new Audi();
		if(type == AutoType.Tesla)
			return new Tesla();
		return null;
	}

}
