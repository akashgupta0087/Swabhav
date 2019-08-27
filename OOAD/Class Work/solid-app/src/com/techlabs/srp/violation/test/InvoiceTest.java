package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("101", "Sachin",1000,20);
		
		invoice.printInvoice(invoice);
	}

}
