package com.techlabs.service;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Book;
import com.techlabs.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	private BookService() {
		System.out.println("Inside Book Service");
	}
	
	public List<Book> getAllBooks(){
		return bookRepo.getAllBooks();
	}
	
	public Blob getImage(String id) {
		return bookRepo.getImage(id);
		
	}
	
	public void addCustomer(String username, String password, String email, int age, String gender, long mobileNumber, String location) {
		bookRepo.addCustomer(username, password, email, age, gender, mobileNumber, location);
	}
	
	public Book getBookById(String id) {
		return bookRepo.getBookById(id);
	}

}
