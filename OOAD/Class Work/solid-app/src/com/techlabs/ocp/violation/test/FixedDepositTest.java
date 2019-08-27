package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalCategory;
import com.techlabs.ocp.violation.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {

		FixedDeposit fd = new FixedDeposit("Sachin", 100, 2, FestivalCategory.NEWYEAR);
		display(fd);
	}

	private static void display(FixedDeposit fd) {
		System.out.println("Name: " + fd.getName() + " PrincipalAmount: " + fd.getPrincipal() + " Years: "
				+ fd.getYears() + " Festival: " + fd.getFestival() + " RateOfInterest: " + fd.calcRate() + " SimpleInterest: " + fd.calcSimpleInterset());
	}
}
