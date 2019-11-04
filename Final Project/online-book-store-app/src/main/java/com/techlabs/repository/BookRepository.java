package com.techlabs.repository;

import java.sql.Blob;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Book;

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
}
