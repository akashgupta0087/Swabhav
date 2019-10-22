package com.techlabs.model.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Candidate;

public class CandidateTest {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		SessionFactory factory = cfg.configure("hibernate-cfg.xml").buildSessionFactory();
		
		System.out.println(factory.getClass());
		
		Candidate c1 = new Candidate();
		c1.setName("Sachin");
		c1.setCgpa(8.5f);
		
		Candidate c2 = new Candidate();
		c2.setName("Virat");
		c2.setCgpa(7.8f);
		
		Session session = factory.openSession();
		
		Transaction txn = session.beginTransaction();
	
		session.save(c1);
		session.save(c2);
		
		List<Candidate> candidates = new CandidateCRUD().readAll(session);
		
		System.out.println("Read All");
		for(Candidate candidate : candidates) {
			System.out.println(candidate.getId() + " " + candidate.getName() + " " + candidate.getCgpa() + "\n");
		}
		
		Candidate candidate = new CandidateCRUD().readById(session, 1);
		
		System.out.println("\nRead By Id");
		System.out.println(candidate.getId() + " " + candidate.getName() + " " + candidate.getCgpa());
		
		new CandidateCRUD().update(session, 1);
		
		new CandidateCRUD().delete(session, 5);
		
		txn.commit();
				
		session.close();
		
		
	}

}
