package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.DBLogger;
import com.techlabs.dip.solution.TaxCalulator;
import com.techlabs.dip.solution.XMLLogger;

public class DIPTest {
	public static void main(String[] args) {
		TaxCalulator tax = new TaxCalulator(new XMLLogger());
		System.out.println("Tax Amount: " + tax.calculateTax(100, 0));
	}

}
