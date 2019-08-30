package com.techlabs.designpatterns.singleton.threadsafe;

public class SingletonThreadSafeTest {
	public static void main(String[] args) {
		SingletonThreadSafe object = SingletonThreadSafe.getInstance();
		
		object.showMessage();
	}
}
