package com.techlabs.lineditems.test;

import java.util.ArrayList;

import com.techlabs.lineditems.LinedItem;

public class TestCollectionGeneric {

	public static void main(String[] args) {
		ArrayList<LinedItem> cart = new ArrayList<LinedItem>();
		
		cart.add(new LinedItem(1, "Iphone X", 30000, 2));
		cart.add(new LinedItem(2,"Realme 2Pro", 15000,4));
		cart.add(new LinedItem(3, "Sony Speaker", 20000, 1));
		cart.add(new LinedItem(4, "Boat Headset", 15000, 2));
		
		display(cart);
		//cart.add("Akash");
	}
	
	private static void display(ArrayList<LinedItem> cart) {
		double totalCostOfCart = 0;
		for(LinedItem item:cart) {
			//LinedItem element = (LinedItem) item;
			System.out.println("Product Id : " + item.getId() + " Name: " + item.getProductName()
			      + " Cost: " + item.getCost() + " Total cost: " + item.calTotalCost());
			totalCostOfCart+= item.calTotalCost();
		}
		System.out.println("Total cost of the cart is: " + totalCostOfCart);
	}

}

