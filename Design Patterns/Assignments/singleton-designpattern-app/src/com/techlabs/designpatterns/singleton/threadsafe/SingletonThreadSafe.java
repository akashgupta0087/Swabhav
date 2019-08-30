package com.techlabs.designpatterns.singleton.threadsafe;


public class SingletonThreadSafe {
private static SingletonThreadSafe instance;
	
	private SingletonThreadSafe() {
	}
	
	synchronized public static SingletonThreadSafe getInstance() {
		if(instance == null) {
		instance = new SingletonThreadSafe	();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!! - Thread safe");
	}

}
