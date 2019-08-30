package com.techlabs.designpatterns.singleton.billpugh;

public class SingletonBillPughTest {
	public static void main(String[] args) {
		SingletonBillPugh object = SingletonBillPugh.getInstance();
		
		object.showMessage();
	}

}
