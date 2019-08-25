package com.techlabs.shoppingcart.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class CustomerPresentation {
	public static void main(String[] args) {

		Product product1 = new Product("P101", "Realme 2Pro", 12000, 10);
		Product product2 = new Product("P102", "Boat Earphone", 10, 50);
		Product product3 = new Product("P103", "JBL Earphone", 10, 50);

		LineItem lineItem1 = new LineItem("L201", 2, product1);
		LineItem lineItem2 = new LineItem("L202", 1, product2);
		LineItem lineItem3 = new LineItem("L203", 1, product3);
		LineItem lineItem4 = new LineItem("L204", 1, product2);
		LineItem lineItem5 = new LineItem("L205", 2, product1);

		Date date1 = getDate("01/01/2014");
		Date date2 = getDate("05/03/2019");

		Order order1 = new Order("O301", date1);
		Order order2 = new Order("O302", date2);

		order1.addLineItem(lineItem1);
		order1.addLineItem(lineItem2);
		order1.addLineItem(lineItem3);
		order1.addLineItem(lineItem4);
		order1.addLineItem(lineItem5);
		order1.removeLineItem("L203");

		order2.addLineItem(lineItem5);
		order2.addLineItem(lineItem4);
		order2.addLineItem(lineItem3);

		Customer customer1 = new Customer("C401", "Sachin");

		customer1.addOrder(order1);
		customer1.addOrder(order2);

		printInvoice(customer1);
	}

	private static void printInvoice(Customer customer) {
		System.out.println("Customer Id: " + customer.getId() + " Name: " + customer.getName());
		for (Order order : customer.getOrders()) {
			System.out.println("\nOrder Id: " + order.getId() + " Date: " + order.getDate());
			displayLineItems(order);
			System.out.println("Total checkout price: " + order.checkOutPrice());
		}
	}

	private static void displayLineItems(Order order) {
		for (LineItem item : order.getItems()) {
			System.out.println("LineItem Id: " + item.getId() + " Quantity: " + item.getQuantity() + " Item Cost: "
					+ item.itemCost());
			System.out.println("Product Id: " + item.getProduct().getId() + " Name: " + item.getProduct().getName()
					+ " Price: " + item.getProduct().getCost() + " DiscountPercent: "
					+ item.getProduct().getDiscountPercent() + " Discounted Price: " + item.getProduct().finalCost());
		}
	}

	private static Date getDate(String filterDate) {
		Date date = null;
		DateFormat dateFormatter = new SimpleDateFormat("dd/mm/yyyy");
		try {
			date = dateFormatter.parse(filterDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

}
