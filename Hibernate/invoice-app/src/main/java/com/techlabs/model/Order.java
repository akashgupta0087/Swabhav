package com.techlabs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order {

	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn
	private Customer cust;
	
//	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//	private Set<LineItem> lineItems = new HashSet<LineItem>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return cust;
	}

	public void setCustomer(Customer cust) {
		this.cust = cust;
	}

//	public Set<LineItem> getLineItems() {
//		return lineItems;
//	}
//
//	public void setLineItems(Set<LineItem> lineItems) {
//		this.lineItems = lineItems;
//	}
	
}
