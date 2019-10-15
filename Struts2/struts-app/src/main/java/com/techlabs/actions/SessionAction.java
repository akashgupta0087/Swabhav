package com.techlabs.actions;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements SessionAware, Action{
	
	private SessionMap<String,Object> sessionMap; 
	private int oldValue;
	private int newValue;

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
		
	}

	@Override
	public String execute() throws Exception {
		if(sessionMap.get("counter") == null) {
			oldValue = 0;
			newValue = 0;
			sessionMap.put("counter",oldValue);
		}
		else {
		oldValue = (int) sessionMap.get("counter");
		sessionMap.put("counter",oldValue+1);
		newValue = (int) sessionMap.get("counter");
//		HttpSession session=ServletActionContext.getRequest().getSession(false);  
		}
		return "success";
	}

	public int getOldValue() {
		return oldValue;
	}

	public int getNewValue() {
		return newValue;
	}

}
