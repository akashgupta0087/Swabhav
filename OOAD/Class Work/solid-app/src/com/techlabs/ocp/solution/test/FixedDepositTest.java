package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.*;;

public class FixedDepositTest {
	public static void main(String[] args) {

		FixedDeposit fd = new FixedDeposit("Sachin", 100, 2, FestivalCategory.NEWYEAR, new NewYearRateCalculator());
		display(fd);
	}

	private static void display(FixedDeposit fd) {
		System.out.println("Name: " + fd.getName() + " PrincipalAmount: " + fd.getPrincipal() + " Years: "
				+ fd.getYears() + " Festival: " + fd.getFestival() + " RateOfInterest: " + fd.getRate().calcRate()
				+ " SimpleInterest: " + fd.calcSimpleInterset());
	}

}
