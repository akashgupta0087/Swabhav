package com.techlabs.shoppingcart.junit;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.*;

public class OrderJUnitTest {
	
	Product product = new Product("P103","Realme 2Pro",12000,10);
	Product product2 = new Product("P104","Boat Earphone",10,50);
	Product product3 = new Product("P105","JBL Earphone", 10,50);
	
	LineItem lineItem = new LineItem("L202",2,product);
	LineItem lineItem2 = new LineItem("L204",1,product2);
	LineItem lineItem3 = new LineItem("L205",1,product3);
	
	
	String filterDate = "01/01/2014";
	
	DateFormat dateFormatter = new SimpleDateFormat("dd/mm/yyyy");
	
	Date date;
	
	Order order1 = new Order("O302",date);
	
	@Test
	void OderConstructorWillPass() {
		Date date = null;
		try {
			date = dateFormatter.parse(filterDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Order order = new Order("O301", date);
		assertEquals(date,order.getDate());
	}
	
	@Test
	void addLineItem_WillAddTheLineItemToTheList() {
		order1.addLineItem(lineItem);
		assertEquals(1,order1.getItems().size());
		}
	
	@Test
	void removeLineItem_WillRemoveTheineItemFromTheList() {
		order1.addLineItem(lineItem);
		order1.removeLineItem("L202");
		assertEquals(0,order1.getItems().size());
		
	}
	
	@Test
	void removeLineItem_WillNotRemoveTheLineItemFromTheList() {
		order1.addLineItem(lineItem);
		order1.removeLineItem("L203");
		assertEquals(1,order1.getItems().size());
	}
	
	@Test
	void count_WillGiveTheCountOfList() {
		assertEquals(0,order1.getItems().size());
	}
	
	//@SuppressWarnings("deprecation")
	@Test
	//@SuppressWarnings(value = { "assertEquals" })
	
	void checkOutPrice_WillGiveTheTotalPriceOfTheOrder() {
		order1.addLineItem(lineItem2);
		order1.addLineItem(lineItem3);
	
		assertEquals(new Double(10),new Double(order1.checkOutPrice()));	
	}
	
	

}
