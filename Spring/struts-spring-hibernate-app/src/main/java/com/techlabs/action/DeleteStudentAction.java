package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.StudentService;

public class DeleteStudentAction implements Action {
	
	private String id;
	@Autowired
	private StudentService service;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		return "success";
	}
	
	public String delete() {

		System.out.println(id);
		service.deleteStudent(id);
		return "success";
	}

}
