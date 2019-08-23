package com.techlabs.shoppingcart;

public class Product {
	private String id;
	private String name;
	private double cost;
	private float discountPercent;
	
	public Product(String id, String name, double cost, float discountPercent) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercent = discountPercent;
	}
	
	public double finalCost() {
		return (cost - (cost * (discountPercent) / 100));
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}
	
	
	
	

}
