package com.techlabs.factorymethod;

public class Audi implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Audi starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Audi stops");
		
	}
	

}
