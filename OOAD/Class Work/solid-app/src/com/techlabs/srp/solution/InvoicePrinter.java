package com.techlabs.srp.solution;

import com.techlabs.srp.solution.Invoice;;

public class InvoicePrinter {

	public void printInvoice(Invoice invoice) {
		System.out.println("Invoice id: " + invoice.getId() + " Name: " + invoice.getName() + " Cost: "
				+ invoice.getCost() + " DiscountPrice: " + invoice.calcDiscount() + " TaxAmount:" + invoice.calcTax()
				+ " TotalCost: " + invoice.calcTotalCost());
	}

}
