package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public int countOrders() {
		return orders.size();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	
	
	

}
