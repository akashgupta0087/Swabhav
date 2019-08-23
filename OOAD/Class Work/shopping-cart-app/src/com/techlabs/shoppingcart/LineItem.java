package com.techlabs.shoppingcart;

public class LineItem {
	private String id;
	private int quantity;
	private Product product;
	
	public LineItem(String id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	
	public double itemCost() {
		return quantity * product.finalCost();
	}

	public String getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	
	
	

}
