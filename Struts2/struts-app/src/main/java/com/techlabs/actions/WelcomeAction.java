package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {
	
	private String devloper;

	public String getDevloper() {
		return devloper;
	}
	
	public void setDevloper(String devloper) {
		this.devloper = devloper;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("Inside Welcome Action");
		return "success";
	}

}
