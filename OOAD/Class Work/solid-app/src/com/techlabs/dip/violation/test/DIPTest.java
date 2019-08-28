package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.LogType;
import com.techlabs.dip.violation.TaxCalculator;

public class DIPTest {

	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(LogType.XML);
		System.out.println("Tax amount: " + tax.calculateTax(100, 0));
	}

}
