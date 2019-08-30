package com.techlabs.designpatterns.singleton.doublechecklocking;

public class SingletonDoubleCheckLocking {
	private static SingletonDoubleCheckLocking instance;

	private SingletonDoubleCheckLocking() {
	}

	public static SingletonDoubleCheckLocking getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckLocking.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheckLocking();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!! - Double check locking");
	}

}
