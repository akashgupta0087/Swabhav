package com.techlabs.shoppingcart.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Product;

class LineItemJUnitTest {
	
	Product product = new Product("P102", "Rayban Goggles", 10000, 40);
	
	LineItem lineItem = new LineItem("L202",2,product);

	@Test
	void ConstrutorWillPass() {
		assertEquals("L202",lineItem.getId());
		assertEquals(2,lineItem.getQuantity());
		assertEquals(product, lineItem.getProduct());
	}
	
	@Test
	void itemCost_WillReturnTheCostOfLineItem() {
		assertEquals(12000, lineItem.itemCost());
		}

}
