package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class WishController implements Action{
	private String name;
	private String wish = "Struts wishes, ";
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public String getWish() {
		return wish + name + " Hello!!";
	}
	public void setWish(String wish) {
		this.wish = wish;
	}
	
	@Override
	public String execute() throws Exception {
		return "success";
	}
	
	public String doWish() {
		message = wish + name + " Hello!!";
		return "success";
	}
	
	
	
	

}
