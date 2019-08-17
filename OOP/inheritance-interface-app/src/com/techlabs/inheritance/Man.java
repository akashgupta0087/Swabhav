package com.techlabs.inheritance;

import com.techlabs.interfaces.IManner;

public class Man implements IManner {

	@Override
	public void wish() {
		System.out.println("Man is wishing");
		
	}

	@Override
	public void depart() {
		System.out.println("Man is departing");
		
	}

}
