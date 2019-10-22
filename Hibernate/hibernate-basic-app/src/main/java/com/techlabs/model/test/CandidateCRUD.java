package com.techlabs.model.test;

import java.util.List;

import org.hibernate.Session;

import com.techlabs.model.Candidate;

public class CandidateCRUD {
	
	public  List<Candidate> readAll(Session session) {
		List<Candidate> list = session.createCriteria(Candidate.class).list();
		return list;
	}
	
	public Candidate readById(Session session, int id) {
		Candidate candidate = (Candidate) session.get(Candidate.class, id);
		return candidate;
		
	}
	
	public void update(Session session, int id) {
		Candidate candidate = (Candidate) session.get(Candidate.class, id);
		candidate.setName("Sachin Tendulkar");
		session.update(candidate);
	}
	
	public void delete(Session session, int id) {
		Candidate candidate = (Candidate) session.get(Candidate.class, id);
		session.delete(candidate);
	}
}
