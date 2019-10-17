package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.StudentService;

public class DeleteStudentAction implements Action {
	
	private String id;
	
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
		StudentService service = StudentService.getInstance();
		service.deleteStudent(id);
		return "success";
	}

}
