package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.model.Cart;
import com.techlabs.model.Customer;
import com.techlabs.repository.BookRepository;
import com.techlabs.service.CustomerService;

public class ViewCartAction implements Action {

	@Autowired
	private CustomerService customerService;
	
	private List<Book> books = new ArrayList<Book>();
	
	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		String username =(String) session.getAttribute("loggedIn");
		Customer customer=customerService.getCustomer(username);
		List<Cart> cartItems = customerService.getCartItems(customer);
		for(Cart cartItem : cartItems) {
			System.out.println(cartItem.getId() +" " + cartItem.getBooks());
			
		}
		return "success";
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
