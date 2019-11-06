package com.techlabs.repository;

import java.sql.Blob;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Book;
import com.techlabs.model.Customer;

@Repository
public class BookRepository {

	@Autowired
	private SessionFactory factory;
	
	private Session session;

	private BookRepository() {
		System.out.println("Inside Book Repository");
	}

	public List<Book> getAllBooks() {
		session = factory.openSession();
		List<Book> books = session.createCriteria(Book.class).list();
		session.close();
		return books;
	}
	
	public Blob getImage(String id) {
		session = factory.openSession();
		Book book = (Book) session.get(Book.class, UUID.fromString(id));
		session.close();
		return book.getImage();
	}
	
	public void addCustomer(String username, String password, String email, int age, String gender, long mobileNumber, String location) {
		Customer cust = new Customer();
		cust.setUsername(username);
		cust.setPassword(password);
		cust.setEmail(email);
		cust.setAge(age);
		cust.setGender(gender);
		cust.setMobileNumber(mobileNumber);
		cust.setLocation(location);
		
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(cust);
		
		txn.commit();
		session.close();
	}
	
	public boolean isUsernameTaken(String username){
		session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Customer cust = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("username", username)).uniqueResult();
		txn.commit();
		session.close();
		
		if(cust != null)
			return true;
		return false;	
	}
	
	public String getPassword(String username){
		session = factory.openSession();
		Customer cust = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("username", username)).uniqueResult();
		session.close();
		System.out.println(cust.getPassword());
		return cust.getPassword();
	}
	
	public Book getBookById(String id) {
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Book.class);
		cr.add(Restrictions.eq("id", UUID.fromString(id)));
		Book book=(Book) cr.uniqueResult();
		
		
		transaction.commit();
		session.close();
		
		return book;
	}
	
}
