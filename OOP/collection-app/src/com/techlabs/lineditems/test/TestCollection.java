package com.techlabs.lineditems.test;

import java.util.ArrayList;

import com.techlabs.lineditems.LinedItem;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		
		cart.add(new LinedItem(1, "Iphone X", 30000, 2));
		cart.add(new LinedItem(2,"Realme 2Pro", 15000,4));
		cart.add(new LinedItem(3, "Sony Speaker", 20000, 1));
		cart.add(new LinedItem(4, "Boat Headset", 15000, 2));
		
		display(cart);
		//cart.add("Akash");
	}
	
	private static void display(ArrayList cart) {
		double totalCostOfCart = 0;
		for(Object item:cart) {
			LinedItem element = (LinedItem) item;
			System.out.println("Product Id : " + element.getId() + " Name: " + element.getProductName()
			      + " Cost: " + element.getCost() + " Total cost: " + element.calTotalCost());
			totalCostOfCart+= element.calTotalCost();
		}
		System.out.println("Total cost of the cart is: " + totalCostOfCart
				);
	}

}
