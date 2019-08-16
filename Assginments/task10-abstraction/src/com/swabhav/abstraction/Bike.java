package com.swabhav.abstraction;

public abstract class Bike {
	
	Bike(){
		System.out.println("Inside bike class constructor");
	}
	
	public abstract void run();
	
	public void changeGear() {
		System.out.println("Gear changed successfully");
	}
}
