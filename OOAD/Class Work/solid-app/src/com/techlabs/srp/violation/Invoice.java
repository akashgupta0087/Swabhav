package com.techlabs.srp.violation;

public class Invoice {
	private static final float GST_PERCENT = 0.18f;
	private String id;
	private String name;
	private double cost;
	private float discount;

	public Invoice(String id, String name, double cost, float discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	public static float getGstPercent() {
		return GST_PERCENT;
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

	public float getDiscount() {
		return discount;
	}

	public double calcDiscount() {
		return (cost * discount / 100);
	}

	public double calcTax() {
		return (cost * GST_PERCENT);
	}

	public double calcTotalCost() {
		return cost + calcTax() - calcDiscount();
	}
	
	public void printInvoice(Invoice invoice) {
		System.out.println("Invoice id: " + invoice.getId() + " Name: " + invoice.getName() + " Cost: "
				+ invoice.getCost() + " DiscountPercent: " + invoice.getDiscount() + " TotalCost: " + invoice.calcTotalCost());
	}

}
