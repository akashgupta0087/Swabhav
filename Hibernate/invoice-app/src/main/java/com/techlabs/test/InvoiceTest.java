package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;

public class InvoiceTest {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		SessionFactory factory = cfg.configure("hibernate-cfg.xml").buildSessionFactory();
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("Sachin");
		c1.setAddress("Andheri");
		
		Customer c2 = new Customer();
		c2.setId(2);
		c2.setName("Virat");
		c2.setAddress("Bandra");
		
		Order o1 = new Order();
		o1.setId(11);
		o1.setCustomer(c1);
		
		Order o2 = new Order();
		o2.setId(12);
		o2.setCustomer(c1);
		
		Order o3 = new Order();
		o3.setId(21);
		o3.setCustomer(c2);
		
		Order o4 = new Order();
		o4.setId(22);
		o4.setCustomer(c2);
		
		LineItem l1 = new LineItem();
		l1.setId(101);
		l1.setName("Milk");
		l1.setQuantity(2);
		l1.setOrder(o1);
		
		LineItem l2 = new LineItem();
		l2.setId(102);
		l2.setName("Bread");
		l2.setQuantity(1);
		l2.setOrder(o1);
		
		LineItem l3 = new LineItem();
		l3.setId(103);
		l3.setName("Eggs");
		l3.setQuantity(8);
		l3.setOrder(o2);
		
		LineItem l4 = new LineItem();
		l4.setId(201);
		l4.setName("Pen");
		l4.setQuantity(5);
		l4.setOrder(o3);
		
		LineItem l5 = new LineItem();
		l5.setId(202);
		l5.setName("Book");
		l5.setQuantity(2);
		l5.setOrder(o3);
		
		LineItem l6 = new LineItem();
		l6.setId(203);
		l6.setName("Pencil");
		l6.setQuantity(4);
		l6.setOrder(o4);
		
		Set<LineItem> lineItems1 = new HashSet<LineItem>();
		Set<LineItem> lineItems2 = new HashSet<LineItem>();
		Set<LineItem> lineItems3 = new HashSet<LineItem>();
		Set<LineItem> lineItems4 = new HashSet<LineItem>();
		
		lineItems1.add(l1);
		lineItems1.add(l2);
		lineItems2.add(l3);
		
		lineItems3.add(l4);
		lineItems3.add(l5);
		lineItems4.add(l6);
		
		o1.setLineItems(lineItems1);
		o2.setLineItems(lineItems2);
		o3.setLineItems(lineItems3);
		o4.setLineItems(lineItems4);
		
		
		Set<Order> orders1 = new HashSet<Order>();
		Set<Order> orders2 = new HashSet<Order>();
		
		orders1.add(o1);
		orders1.add(o2);
		
		orders2.add(o3);
		orders2.add(o4);
		
		c1.setOrders(orders1);
		c2.setOrders(orders2);
		
		Session session = factory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(c1);
		session.save(c2);
		
		txn.commit();
		
		session.close();
		
	}

}
