package com.techlabs.designpatterns.singleton.lazyinstantiation;

public class SingletonLazyTest {
	public static void main(String[] args) {
		SingletonLazy object = SingletonLazy.getInstance();
		
		object.showMessage();
		
	}
	
	
	

}
