package com.techlabs.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Book;
import com.techlabs.model.Cart;
import com.techlabs.model.Customer;
import com.techlabs.repository.BookRepository;

@Service
public class CustomerService {
	@Autowired
	private BookRepository bookRepo;
	
	public Customer getCustomer(String username) {
		return bookRepo.getCustomer(username);
	}

	public void addToCart(Customer customer, String bookId) {
		bookRepo.addToCart(customer,bookId);
		
	}
	
	public List<Cart> getCartItems(Customer customer) {
		return bookRepo.getCartItems(customer);
	}
}
