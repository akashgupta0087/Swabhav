package com.techlabs.dip.solution;

public class XMLLogger implements ILoggable{

	@Override
	public void log(String errMessage) {
		System.out.println("Wrting into xml logger:" + errMessage);
	}

}
