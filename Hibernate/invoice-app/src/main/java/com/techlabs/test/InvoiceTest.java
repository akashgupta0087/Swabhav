package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InvoiceTest {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		SessionFactory session = cfg.configure("hibernate-cfg.xml").buildSessionFactory();
	}

}
