package com.techlabs.designpatterns.singleton.doublechecklocking;

public class SingletonDoubleCheckLockingTest {
	public static void main(String[] args) {
		SingletonDoubleCheckLocking object = SingletonDoubleCheckLocking.getInstance();
		
		object.showMessage();
	}
}
