package com.techlabs.shoppingcart.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

class CustomerJUnitTest {
	
	Customer customer = new Customer("C401","Sachin");
	Product product = new Product("P103","Realme 2Pro",12000,10);
	Product product2 = new Product("P104","Boat Earphone",10,50);
	Product product3 = new Product("P105","JBL Earphone", 10,50);
	
	LineItem lineItem = new LineItem("L202",2,product);
	LineItem lineItem2 = new LineItem("L204",1,product2);
	LineItem lineItem3 = new LineItem("L205",1,product3);
	
	Date date;
	Order order1 = new Order("O302",date);
	Order order2 = new Order("O303",date);

	@Test
	void ContructorWillPass() {
		assertEquals("C401",customer.getId());
		assertEquals("Sachin",customer.getName());
	}
	
	@Test
	void addOrder_WillAddTheOrdersToTheList() {
		customer.addOrder(order1);
		customer.addOrder(order2);
		assertEquals(2,customer.getOrders().size());
	}
	
	@Test
	void countOrders_WillGiveTheCountOfOrders() {
		assertEquals(0,customer.getOrders().size());
	}

}
