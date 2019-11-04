package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.service.BookService;

public class WelcomeAction implements Action{
	
	@Autowired
	private BookService service;
	
	private List<Book> books;
	private String imgName = "https://covers.openlibrary.org/w/id/8045456-M.jpg";

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public String execute() throws Exception {
		books = service.getAllBooks();
		return "success";
	}
	
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	

}
