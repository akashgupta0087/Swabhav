package com.techlabs.dip.solution;

public class DBLogger implements ILoggable {

	@Override
	public void log(String errMessage) {
		System.out.println("Writing into database logger:" + errMessage);

	}

}
