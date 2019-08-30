package com.techlabs.designpatterns.singleton.earlyinstantiation;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton object = Singleton.getInstance();
		
		object.showMessage();
	}

}
