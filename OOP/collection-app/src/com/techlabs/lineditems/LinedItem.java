package com.techlabs.lineditems;

import java.util.Comparator;

public class LinedItem implements Comparable<LinedItem> {
	private String productName;
	private int id;
	private double cost;
	private int quantity;
	
	public LinedItem(int id , String productName, double cost, int quantity) {
		super();
		this.productName = productName;
		this.id = id;
		this.cost = cost;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public int getId() {
		return id;
	}

	public double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double calTotalCost() {
		return cost * quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id == ((LinedItem)obj) .id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public int compareTo(LinedItem item) {
		return this.id - item.id;
	}


}
