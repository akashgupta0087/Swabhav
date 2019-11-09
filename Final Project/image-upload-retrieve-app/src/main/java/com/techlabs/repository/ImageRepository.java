package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Image;


@Repository
public class ImageRepository {
	
	@Autowired
	private SessionFactory factory;
	
	public void addImage(String name, String image) {
		Image img = new Image();
		img.setName(name);
		img.setImage(image);
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(img);
		
		txn.commit();
		session.close();
	}
	
	public List<Image> getAllImages(){
		List<Image> images = new ArrayList<Image>();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		images = session.createCriteria(Image.class).list();
		txn.commit();
		session.close();
		return images;
	}

}
