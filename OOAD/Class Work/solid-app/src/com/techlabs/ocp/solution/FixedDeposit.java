package com.techlabs.ocp.solution;

public class FixedDeposit {
	private String name;
	private double principal;
	private int years;
	private FestivalCategory festival;
	private IRateCalculator rate;
	
	public FixedDeposit(String name, double principal, int years, FestivalCategory festival, IRateCalculator rate) {
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public IRateCalculator getRate() {
		return rate;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getYears() {
		return years;
	}

	public FestivalCategory getFestival() {
		return festival;
	}
	
	public double calcSimpleInterset() {
		return ((principal * years * rate.calcRate()) / 100);
		
	}
	

}
