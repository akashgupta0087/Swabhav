package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoicePrinter;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("101", "Sachin",1000,20);
		
		InvoicePrinter print = new InvoicePrinter();
		
		print.printInvoice(invoice);
	}

}
