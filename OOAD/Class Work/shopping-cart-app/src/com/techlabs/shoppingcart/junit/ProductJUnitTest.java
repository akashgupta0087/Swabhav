package com.techlabs.shoppingcart.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Product;

class ProductJUnitTest {
	
	Product product = new Product("101","IphoneX",90000,10);

	@Test
	void ConstructorWillPass() {
		assertEquals("P101",product.getId());
		assertEquals("IphoneX",product.getName());
		assertEquals(90000,product.getCost());
		assertEquals(10,product.getDiscountPercent());
		
	}
	
	@Test
	void finalCostWillGiveProperCost() {
		assertEquals(81000,product.finalCost());
	}

}
