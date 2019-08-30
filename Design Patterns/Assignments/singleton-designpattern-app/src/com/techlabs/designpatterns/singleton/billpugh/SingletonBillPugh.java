package com.techlabs.designpatterns.singleton.billpugh;

public class SingletonBillPugh {
	private SingletonBillPugh() {

	}

	private static class BillPughSingleton {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return BillPughSingleton.INSTANCE;
	}
	
	public void showMessage() {
		System.out.println("Hello World!! - Bill Pugh");
	}

}
